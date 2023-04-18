package com.wlei24.queuesystem.misc.controller;

import com.wlei24.queuesystem.misc.entity.BusinessSwitch;
import com.wlei24.queuesystem.misc.entity.City;
import com.wlei24.queuesystem.misc.entity.Store;
import com.wlei24.queuesystem.misc.service.impl.BasicMiscServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author wlei24
 */
@RestController
@RequestMapping("/misc")
public class BasicController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private BasicMiscServiceImpl basicService;

    @PostMapping("/getSetting")
    public BusinessSwitch getSetting() {
        return basicService.getBusinessSwitch();
    }

    @PostMapping("/getCityList")
    public List<City> getCityList() {
        return basicService.getCityList();
    }

    @PostMapping("/getStoreListByCityId")
    public List<Store> getStoreListByCityId(@RequestParam Integer cityId, @RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        List<Store> storeList = null;

        try {
            storeList =  basicService.getStoreListByCityId(cityId, 121.44665, 31.20020, pageNum, pageSize);
        } catch (Exception e) {
            logger.error("[getStoreListByCityId] Error: " + e.getMessage() +" - "+ e.getStackTrace());
            e.printStackTrace();
        }

        return storeList;
    }
}
