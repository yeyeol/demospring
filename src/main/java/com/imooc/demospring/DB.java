package com.imooc.demospring;

import com.mysql.jdbc.Driver;
import lombok.Data;
import lombok.experimental.Accessors;

import java.lang.reflect.Field;
import java.sql.*;

/**
 * @author linckye
 */
public class DB {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Area area = getArea(27);
        System.out.println(area);
    }

    @Data
    @Accessors(chain = true)
    private static class Area {
        private Integer area_id;
        private String area_name;
        private Integer priority;
    }

    private static Area getArea(Integer areaId) throws Exception {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demospring", "root", "yeyan525");
            PreparedStatement statement = connection.prepareStatement("select * from tb_area where area_id = ?");
            statement.setInt(1, areaId);
            ResultSet resultSet = statement.executeQuery();
            return convert(resultSet, Area.class);
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    //利用反射，将结果集转化对象
    private static <T> T convert(ResultSet resultSet, Class<T> targetClass) throws Exception{
        Field[] fields = targetClass.getDeclaredFields();
        while (resultSet.next()) {
            T o = targetClass.newInstance();
            for (Field field : fields) {
                field.setAccessible(true);
                Object value = resultSet.getObject(field.getName());
                field.set(o, value);
            }
            return o;
        }
        return null;
    }

}
