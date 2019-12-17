package com.imooc.demospring;

import com.imooc.demospring.dao.AreaDao;
import com.imooc.demospring.entity.Area;
import com.imooc.demospring.service.AreaService;
import com.imooc.demospring.service.Impl.AreaServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DemospringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DemospringApplication.class, args);
        AreaDao areaDao = applicationContext.getBean(AreaDao.class);
       // AreaService areaService = applicationContext.getBean(AreaService.class);

      /*
;      test
       */
//       List<Area> areaList = areaDao.queryArea();
//       System.out.println(areaList.size());

//       Area area = areaDao.queryAreaById(1);
//       String areaname = area.getAreaName();
//       System.out.println(areaname);

//        areaDao.deleteArea(10);
//
//        Area area = new Area();
//       area.setAreaName("东苑");
//        area.setPriority(2);
//        area.setAreaId(3);
//        area.setLastEditTime(new Date());
//       areaDao.insertArea(area);
//       areaDao.updateArea(area);
    }

}
