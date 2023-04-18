package com.wlei24.queuesystem.misc.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author wlei24
 */
@Component
@Data
public class BusinessSwitch implements Serializable {
    /**
     * 是否开启地图页面.
     */
    @Value("${mapPageSwitch:true}")
    private Boolean mapPageSwitch;

    /**
     * 是否开启线上取号.
     */
    @Value("${onlineTakeQueueSwitch:true}")
    private Boolean onlineTakeQueueSwitch;


}
