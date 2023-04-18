package com.wlei24.queuesystem.misc.entity;

import lombok.Data;
import java.sql.Date;

/**
 * 城市实体类.
 *
 * @Created 2023-4-17 11:31:21
 * @author wlei24
 */
@Data
public class City {
    /**
     * 城市id.
     */
    private Integer id;

    /**
     * 城市名称.
     */
    private String name;

    /**
     * 城市纬度.
     */
    private Double latitude;

    /**
     * 城市经度.
     */
    private Double longitude;

    /**
     * 城市索引.
     */
    private String cityIndex;

    /**
     * 城市是否热门.
     */
    private Integer isHot;

    /**
     * 城市是否启用.
     */
    private Integer isEnable;

    /**
     * 城市创建时间.
     */
    private Date createTime;

    /**
     * 城市更新时间.
     */
    private Date updateTime;
}
