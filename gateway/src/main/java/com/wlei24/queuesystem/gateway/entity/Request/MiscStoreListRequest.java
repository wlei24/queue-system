package com.wlei24.queuesystem.gateway.Entity.Request;

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
     * 分页ID
     */
    private Integer pageId;

    /**
     * 分页数量
     */
    private Integer pageSize;
}
