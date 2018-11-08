package com.chs.wxsmall.model;

import javax.persistence.*;

@Table(name = "store_info")
public class StoreInfo {
    /**
     * 购买地ID
     */
    @Column(name = "store_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String storeId;

    /**
     * 店名称
     */
    @Column(name = "store_name")
    private String storeName;

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
     * 获取店名称
     *
     * @return store_name - 店名称
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 设置店名称
     *
     * @param storeName 店名称
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}