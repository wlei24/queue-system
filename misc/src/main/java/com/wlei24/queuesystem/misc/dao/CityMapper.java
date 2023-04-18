package com.wlei24.queuesystem.misc.dao;

import com.wlei24.queuesystem.misc.entity.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wlei24
 */
@Mapper
public interface CityMapper {
    /**
     * 获取所有城市
     * @return
     */
    List<City> findAll();
}
