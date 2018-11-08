package com.chs.wxsmall.model.request;

import lombok.Data;

@Data
public class StoreInfoRequest {
    /**
     * 购买地ID
     */
    private String storeId;

    /**
     * 店名称
     */
    private String storeName;
}
