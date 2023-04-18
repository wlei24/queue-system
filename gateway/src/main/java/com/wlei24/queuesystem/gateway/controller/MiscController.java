package com.wlei24.queuesystem.gateway.Controller;

import com.wlei24.queuesystem.gateway.Controller.Client.IMiscClient;
import com.wlei24.queuesystem.gateway.Entity.Request.MiscStoreListRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author wlei24
 * @version 0.0.1
 */
@RestController
@RequestMapping("/gateway/misc")
public class MiscController {

    @Autowired
    private IMiscClient iMiscC;

    /**
     * 获取系统设置.
     * @return setting
     */
    @PostMapping("/getSettings")
    public String getSetting() {
        return iMiscC.getSetting();
    }

    /**
     * 获取城市列表(含热门城市标签).
     * @return city list
     */
    @PostMapping( "/city/getList")
    public String getCityList() {
        return "cityList";
    }

    /**
     * 根据城市id获取门店列表.
     * @return store list
     */
    @PostMapping( "/store/getListByCityId")
    public String getStoreListByCityId(@RequestBody MiscStoreListRequest req) {
        return req.toString();
    }

    /**
     * 根据城市id和搜索词获取门店列表.
     * @return store list
     */
    @PostMapping("/store/getListByCityIdAndSearchWord")
    public String getStoreListByCityIdAndSearchWord(@RequestBody MiscStoreListRequest req) {
        return req.toString();
    }

    @PostMapping("/store/getInfoByStoreId")
    public String getStoreInfoByStoreId(@RequestBody MiscStoreListRequest req) {
        return req.toString();
    }

}
