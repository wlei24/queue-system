package com.wlei24.queuesystem.misc.dao;

import com.wlei24.queuesystem.misc.entity.Store;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wlei24
 */
@Mapper
public interface StoreMapper {
    /**
     * 根据城市ID获取门店
     *
     * @param cityId Integer
     * @return
     */
    List<Store> selectListByCityId(Integer cityId);
}
