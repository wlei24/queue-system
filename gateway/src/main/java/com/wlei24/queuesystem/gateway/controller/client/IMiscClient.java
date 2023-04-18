package com.wlei24.queuesystem.gateway.Controller.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

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
    String getSetting();
}
