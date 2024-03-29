package com.imooc.demospring.ye;

import lombok.Data;
import lombok.experimental.Accessors;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author linckye
 */
public class JDBC {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");//注册驱动
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demospring", "root", "yeyan525");//和数据库建立连接
            PreparedStatement statement = connection.prepareStatement("select * from tb_area where area_id = ?");//创建执行sql的statement
            statement.setInt(1, 27);//传入上句中？的参数
            ResultSet resultSet = statement.executeQuery();//执行结果
//            while(resultSet.next()) {
//                System.out.println(resultSet.getInt("priority"));
//            }
            Area area = convert(resultSet,Area.class);
//            area.toString();
            System.out.println(area);
        }finally {
            if(connection != null){
                connection.close();
            }
        }
    }
//
    @Data
    @Accessors(chain = true)
    public static class Area{
        String area_name;
        Integer area_id;
        Integer priority;
}

//将结果集转换为具体对象
    private static <T> T convert(ResultSet resultSet, Class<T> targetClass) throws Exception{
        Field[] fields = targetClass.getDeclaredFields();
        T instance = targetClass.newInstance();
        while(resultSet.next()){
            for (Field field : fields) {
                field.setAccessible(true);
                Object value = resultSet.getObject(field.getName());
                field.set(instance,value);
            }
        }
        return instance;
    }

}
