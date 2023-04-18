package com.wlei24.queuesystem.misc.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wlei24
 */
@Component
@FeignClient(name = "QUEUE-MISC.SERVICE")
public class BasicMiscService {
    @GetMapping("/misc/settings")
    public String getSetting() {
        return "setting";
    }
}
