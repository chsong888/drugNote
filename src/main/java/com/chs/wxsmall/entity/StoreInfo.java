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
public class StoreInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 购买地ID
     */
    private String storeId;

    /**
     * 店名称
     */
    private String storeName;


}
