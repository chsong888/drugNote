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
public class DrugInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 药品信息表ID
     */
    private String drupId;

    /**
     * 药品品牌名称
     */
    private String drugBrand;

    /**
     * 药品中文名称
     */
    private String drugCnName;

    /**
     * 药品英文名称
     */
    private String drugEnName;

    /**
     * 药品类别 处方药、非处方药
     */
    private String drupType;

    /**
     * 药品规格 1g*30袋/盒
     */
    private String drupSpec;

    /**
     * 产品剂型 颗粒、药片、药液
     */
    private String drupAgent;

    /**
     * 生产企业
     */
    private String drupManu;

    /**
     * 批准文号
     */
    private String approvalNum;

    /**
     * 条形码
     */
    private String barCode;

    /**
     * 药品图片
     */
    private String drupPic;


}
