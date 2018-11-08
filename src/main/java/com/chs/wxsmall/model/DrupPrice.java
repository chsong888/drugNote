package com.chs.wxsmall.model;

import javax.persistence.*;

@Table(name = "drup_price")
public class DrupPrice {
    /**
     * 价格ID
     */
    @Column(name = "price_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String priceId;

    /**
     * 药品信息表ID
     */
    @Column(name = "drup_id")
    private String drupId;

    /**
     * 购买地ID
     */
    @Column(name = "store_id")
    private String storeId;

    /**
     * 购买地
     */
    @Column(name = "buy_store")
    private String buyStore;

    /**
     * 价格
     */
    private String price;

    /**
     * 获取价格ID
     *
     * @return price_id - 价格ID
     */
    public String getPriceId() {
        return priceId;
    }

    /**
     * 设置价格ID
     *
     * @param priceId 价格ID
     */
    public void setPriceId(String priceId) {
        this.priceId = priceId;
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
     * 获取购买地ID
     *
     * @return store_id - 购买地ID
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * 设置购买地ID
     *
     * @param storeId 购买地ID
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    /**
     * 获取购买地
     *
     * @return buy_store - 购买地
     */
    public String getBuyStore() {
        return buyStore;
    }

    /**
     * 设置购买地
     *
     * @param buyStore 购买地
     */
    public void setBuyStore(String buyStore) {
        this.buyStore = buyStore;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public String getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(String price) {
        this.price = price;
    }
}