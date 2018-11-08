package com.chs.wxsmall.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author chensong
 * @since 2018-11-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class HomeStock implements Serializable {

    private static final long serialVersionUID = 1L;

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
