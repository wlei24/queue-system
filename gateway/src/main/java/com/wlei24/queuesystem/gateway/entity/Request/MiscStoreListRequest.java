package com.wlei24.queuesystem.gateway.entity.Request;

import lombok.Data;

/**
 * @author wlei24
 */
@Data
public class MiscStoreListRequest {
    /**
     * 城市ID
     */
    private Integer cityId;

    /**
     * 搜索词
     */
    private String searchWord;

    /**
     * 分页页码
     */
    private Integer pageNum;

    /**
     * 分页数量
     */
    private Integer pageSize;
}
