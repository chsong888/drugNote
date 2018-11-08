package com.chs.wxsmall.model;

import javax.persistence.*;

@Table(name = "home_stock")
public class HomeStock {
    /**
     * 药品库存表ID
     */
    @Column(name = "stock_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String stockId;

    /**
     * 药品信息表ID
     */
    @Column(name = "drup_id")
    private String drupId;

    /**
     * 生产日期
     */
    @Column(name = "product_start_date")
    private String productStartDate;

    /**
     * 生产结束日期
     */
    @Column(name = "product_end_date")
    private String productEndDate;

    /**
     * 有效期
     */
    @Column(name = "validity_date")
    private String validityDate;

    /**
     * 剩余数量
     */
    @Column(name = "surplus_num")
    private String surplusNum;

    /**
     * 获取药品库存表ID
     *
     * @return stock_id - 药品库存表ID
     */
    public String getStockId() {
        return stockId;
    }

    /**
     * 设置药品库存表ID
     *
     * @param stockId 药品库存表ID
     */
    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    /**
     * 获取药品信息表ID
     *
     * @return drup_id - 药品信息表ID
     */
    public String getDrupId() {
        return drupId;
    }

    /**
     * 设置药品信息表ID
     *
     * @param drupId 药品信息表ID
     */
    public void setDrupId(String drupId) {
        this.drupId = drupId;
    }

    /**
     * 获取生产日期
     *
     * @return product_start_date - 生产日期
     */
    public String getProductStartDate() {
        return productStartDate;
    }

    /**
     * 设置生产日期
     *
     * @param productStartDate 生产日期
     */
    public void setProductStartDate(String productStartDate) {
        this.productStartDate = productStartDate;
    }

    /**
     * 获取生产结束日期
     *
     * @return product_end_date - 生产结束日期
     */
    public String getProductEndDate() {
        return productEndDate;
    }

    /**
     * 设置生产结束日期
     *
     * @param productEndDate 生产结束日期
     */
    public void setProductEndDate(String productEndDate) {
        this.productEndDate = productEndDate;
    }

    /**
     * 获取有效期
     *
     * @return validity_date - 有效期
     */
    public String getValidityDate() {
        return validityDate;
    }

    /**
     * 设置有效期
     *
     * @param validityDate 有效期
     */
    public void setValidityDate(String validityDate) {
        this.validityDate = validityDate;
    }

    /**
     * 获取剩余数量
     *
     * @return surplus_num - 剩余数量
     */
    public String getSurplusNum() {
        return surplusNum;
    }

    /**
     * 设置剩余数量
     *
     * @param surplusNum 剩余数量
     */
    public void setSurplusNum(String surplusNum) {
        this.surplusNum = surplusNum;
    }
}