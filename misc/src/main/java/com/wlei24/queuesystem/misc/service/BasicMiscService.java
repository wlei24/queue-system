package com.wlei24.queuesystem.misc.service;

import com.wlei24.queuesystem.misc.entity.City;
import com.wlei24.queuesystem.misc.entity.BusinessSwitch;
import com.wlei24.queuesystem.misc.entity.Store;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wlei24
 */
public interface BasicMiscService {
    /**
     * 获取业务开关
     * @return
     */
    BusinessSwitch getBusinessSwitch();

    /**
     * 获取城市列表（含是否热门城市）
     * @return
     */
    List<City> getCityList();

    /**
     * 获取门店列表BY城市ID
     *
     * @param cityId Integer
     * @return
     */
    List<Store> getStoreListByCityId(Integer cityId);

    /**
     * 获取门店列表BY城市ID
     * 根据当前经纬度对列表进行排队
     *
     * @param cityId Integer
     * @param longitude Double
     * @param latitude Double
     * @param pageNum Integer
     * @param pageSize Integer
     * @return
     */
    List<Store> getStoreListByCityId(Integer cityId, Double longitude, Double latitude,Integer pageNum, Integer pageSize);


}
