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
public class DrupPrice implements Serializable {

    private static final long serialVersionUID = 1L;

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
