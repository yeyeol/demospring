package com.imooc.demospring.dao;

import com.imooc.demospring.entity.Area;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author linckye
 */

public interface AreaDao {
    /**
     * 列出区域列表
     * @return areaList
     */
    List<Area> queryArea();

    /**
     * 根据Id列出具体区域
     * @param areaId
     * @return area
     */
    Area queryAreaById(int areaId);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 根据Id删除区域信息
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);

}
