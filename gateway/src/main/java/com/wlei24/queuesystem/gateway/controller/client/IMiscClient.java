package com.wlei24.queuesystem.gateway.controller.client;

import com.wlei24.queuesystem.misc.entity.BusinessSwitch;
import com.wlei24.queuesystem.misc.entity.City;
import com.wlei24.queuesystem.misc.entity.Store;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author wlei24
 */
@FeignClient("QUEUE-MISC.SERVICE")
public interface IMiscClient {
    /**
     * Get setting from misc service.
     * @return setting
     */
    @PostMapping("/misc/getSetting")
    BusinessSwitch getSetting();

    /**
     * Get city list from misc service.
     * @return city list
     */
    @PostMapping("/misc/getCityList")
    List<City> getCityList();

    /**
     *
     * @param cityId
     * @param pageNum
     * @param pageSize
     * @return
     */
    @PostMapping("/misc/getStoreListByCityId")
    List<Store> getStoreListByCityId(@RequestParam Integer cityId, @RequestParam Integer pageNum, @RequestParam Integer pageSize);

    /**
     * Get store list by cityId and searchWord from misc service.
     *
     * @param cityId
     * @param searchWord
     * @return
     */
    @PostMapping("/misc/getStoreListByCityIdAndSearchWord")
    List<Store> getStoreListByCityIdAndSearchWord(@RequestParam Integer cityId, @RequestParam String searchWord);
}
