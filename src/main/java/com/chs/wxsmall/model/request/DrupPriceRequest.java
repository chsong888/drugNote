package com.chs.wxsmall.model.request;

import lombok.Data;

@Data
public class DrupPriceRequest {
    /**
     * 价格ID
     */
    private String priceId;

    /**
     * 药品信息表ID
     */
    private String drupId;

    /**
     * 购买地ID
     */
    private String storeId;

    /**
     * 购买地
     */
    private String buyStore;

    /**
     * 价格
     */
    private String price;
}
