package com.wlei24.queuesystem.gateway.controller;

import com.wlei24.queuesystem.common.response.Result;
import com.wlei24.queuesystem.gateway.controller.client.IMiscClient;
import com.wlei24.queuesystem.gateway.entity.Request.MiscStoreListRequest;
import com.wlei24.queuesystem.misc.entity.BusinessSwitch;
import com.wlei24.queuesystem.misc.entity.City;
import com.wlei24.queuesystem.misc.entity.Store;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wlei24
 * @version 0.0.1
 */
@RestController
@RequestMapping("/gateway/misc")
public class MiscController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private IMiscClient iMiscClient;

    /**
     * 获取系统设置.
     * @return setting
     */
    @PostMapping("/getSettings")
    public Result<BusinessSwitch> getSetting() {
        return Result.success(iMiscClient.getSetting());
    }

    /**
     * 获取城市列表(含热门城市标签).
     * @return city list
     */
    @PostMapping( "/getCityList")
    public Result<List<City>> getCityList() {
        return Result.success(iMiscClient.getCityList());
    }

    /**
     * 根据城市id获取门店列表.
     * @return store list
     */
    @PostMapping( "/getStoreListByCityId")
    public Result<List<Store>> getStoreListByCityId(@RequestBody MiscStoreListRequest req) {
        return Result.success(iMiscClient.getStoreListByCityId(req.getCityId(), req.getPageNum(), req.getPageSize()));
    }

    /**
     * 根据城市id和搜索词获取门店列表.
     * @return store list
     */
    @PostMapping("/getStoreListByCityIdAndSearchWord")
    public Result<List<Store>> getStoreListByCityIdAndSearchWord(@RequestBody MiscStoreListRequest req) {
        return Result.success(iMiscClient.getStoreListByCityIdAndSearchWord(req.getCityId(), req.getSearchWord()));
    }

    /**
     * 根据门店id获取门店信息.
     * @return store info
     */
    @PostMapping("/store/getInfoByStoreId")
    public String getStoreInfoByStoreId(@RequestBody MiscStoreListRequest req) {
        return req.toString();
    }
}
