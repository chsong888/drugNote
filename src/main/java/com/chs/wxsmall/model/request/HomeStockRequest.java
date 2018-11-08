package com.chs.wxsmall.model.request;

import lombok.Data;

@Data
public class HomeStockRequest {
    /**
     * 药品库存表ID
     */
    private String stockId;

    /**
     * 药品信息表ID
     */
    private String drupId;

    /**
     * 生产日期
     */
    private String productStartDate;

    /**
     * 生产结束日期
     */
    private String productEndDate;

    /**
     * 有效期
     */
    private String validityDate;

    /**
     * 剩余数量
     */
    private String surplusNum;
}
