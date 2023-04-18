package com.wlei24.queuesystem.misc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.time.LocalDateTime;

/**
 * 城市实体类.
 *
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 城市更新时间.
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;
}
