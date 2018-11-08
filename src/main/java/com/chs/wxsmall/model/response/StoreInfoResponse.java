package com.chs.wxsmall.model.response;

import lombok.Data;

@Data
public class StoreInfoResponse {
    /**
     * 购买地ID
     */
    private String storeId;

    /**
     * 店名称
     */
    private String storeName;
}
