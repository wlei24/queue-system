package com.wlei24.queuesystem.misc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author wlei24
 */
@Data
public class Store {
    /**
     * 门店ID
     */
    private Integer id;

    /**
     * 门店号
     */
    private String code;

    /**
     * 门店名称
     */
    private String name;

    /**
     * 门店营业开始时间
     */
    @JsonFormat(pattern = "HH:mm")
    private LocalTime startTime;

    /**
     * 门店营业结束时间
     */
    @JsonFormat(pattern = "HH:mm")
    private LocalTime endTime;

    /**
     * 门店位置经度
     */
    private Double longitude;

    /**
     * 门店位置纬度
     */
    private Double latitude;

    /**
     * 门店状态
     * 0-关店
     * 1-临时闭店
     * 2-开店
     */
    private Integer status;

    /**
     * 门店标签
     */
    private String tags;

    /**
     * 门店所属城市
     */
    private Integer cityId;

    /**
     * 门店位置
     */
    private String address;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    /**
     * 门店距某个位置距离
     */
    @JsonFormat(pattern = "0.0")
    private Double distance;
}
