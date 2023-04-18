package com.wlei24.queuesystem.misc.service.impl;

import com.wlei24.queuesystem.common.utils.DistanceCalculator;
import com.wlei24.queuesystem.misc.dao.CityMapper;
import com.wlei24.queuesystem.misc.dao.StoreMapper;
import com.wlei24.queuesystem.misc.entity.City;
import com.wlei24.queuesystem.misc.entity.BusinessSwitch;
import com.wlei24.queuesystem.misc.entity.Store;
import com.wlei24.queuesystem.misc.service.BasicMiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author wlei24
 */
@Service
public class BasicMiscServiceImpl implements BasicMiscService {

    @Value("${pageSize:10}")
    private Integer pageSize = 10;

    @Autowired
    private BusinessSwitch businessSwitch;

    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private StoreMapper storeMapper;

    @Override
    public BusinessSwitch getBusinessSwitch() {
        return businessSwitch;
    }

    @Override
    public List<City> getCityList() {
        return cityMapper.findAll();
    }

    @Override
    public List<Store> getStoreListByCityId(Integer cityId) {
        return storeMapper.selectListByCityId(cityId);
    }

    @Override
    public List<Store> getStoreListByCityId(Integer cityId, Double longitude, Double latitude, Integer pageNum, Integer pageSize) {
        List<Store> storeList = storeMapper.selectListByCityId(cityId);

        //根据经纬度对storeList进行排序
        for (int i = 0; i < storeList.size(); i++) {
            Store store = storeList.get(i);
            //结合store对象内的经纬度和当前经纬度计算距离
            double distance = DistanceCalculator.calculate(longitude, latitude, store.getLongitude(), store.getLatitude());
            store.setDistance(distance);
        }

        //根据距离进行排序
        Collections.sort(storeList, (o1, o2) -> {
            if (o1.getDistance() > o2.getDistance()) {
                return 1;
            } else if (o1.getDistance() < o2.getDistance()) {
                return -1;
            } else {
                return 0;
            }
        });

        //分页
        int totalPage = (int) Math.ceil(storeList.size() / (double)pageSize);

        if (pageNum > totalPage) {
            throw new RuntimeException("pageNum is out of range, totalPage is " + totalPage + ", pageNum is " + pageNum);
        }

        int start = (pageNum - 1) * pageSize;
        int end = pageNum * pageSize;
        end = end > storeList.size() ? storeList.size() : end;
        List<Store> storeSubList = storeList.subList(start, end);

        return storeSubList;
    }
}
