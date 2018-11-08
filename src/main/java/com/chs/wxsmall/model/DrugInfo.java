package com.chs.wxsmall.model;

import javax.persistence.*;

@Table(name = "drug_info")
public class DrugInfo {
    /**
     * 药品信息表ID
     */
    @Column(name = "drup_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String drupId;

    /**
     * 药品品牌名称
     */
    @Column(name = "drug_brand")
    private String drugBrand;

    /**
     * 药品中文名称
     */
    @Column(name = "drug_cn_name")
    private String drugCnName;

    /**
     * 药品英文名称
     */
    @Column(name = "drug_en_name")
    private String drugEnName;

    /**
     * 药品类别 处方药、非处方药
     */
    @Column(name = "drup_type")
    private String drupType;

    /**
     * 药品规格 1g*30袋/盒
     */
    @Column(name = "drup_spec")
    private String drupSpec;

    /**
     * 产品剂型 颗粒、药片、药液
     */
    @Column(name = "drup_agent")
    private String drupAgent;

    /**
     * 生产企业
     */
    @Column(name = "drup_manu")
    private String drupManu;

    /**
     * 批准文号
     */
    @Column(name = "approval_num")
    private String approvalNum;

    /**
     * 条形码
     */
    @Column(name = "bar_code")
    private String barCode;

    /**
     * 药品图片
     */
    @Column(name = "drup_pic")
    private String drupPic;

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
     * 获取药品品牌名称
     *
     * @return drug_brand - 药品品牌名称
     */
    public String getDrugBrand() {
        return drugBrand;
    }

    /**
     * 设置药品品牌名称
     *
     * @param drugBrand 药品品牌名称
     */
    public void setDrugBrand(String drugBrand) {
        this.drugBrand = drugBrand;
    }

    /**
     * 获取药品中文名称
     *
     * @return drug_cn_name - 药品中文名称
     */
    public String getDrugCnName() {
        return drugCnName;
    }

    /**
     * 设置药品中文名称
     *
     * @param drugCnName 药品中文名称
     */
    public void setDrugCnName(String drugCnName) {
        this.drugCnName = drugCnName;
    }

    /**
     * 获取药品英文名称
     *
     * @return drug_en_name - 药品英文名称
     */
    public String getDrugEnName() {
        return drugEnName;
    }

    /**
     * 设置药品英文名称
     *
     * @param drugEnName 药品英文名称
     */
    public void setDrugEnName(String drugEnName) {
        this.drugEnName = drugEnName;
    }

    /**
     * 获取药品类别 处方药、非处方药
     *
     * @return drup_type - 药品类别 处方药、非处方药
     */
    public String getDrupType() {
        return drupType;
    }

    /**
     * 设置药品类别 处方药、非处方药
     *
     * @param drupType 药品类别 处方药、非处方药
     */
    public void setDrupType(String drupType) {
        this.drupType = drupType;
    }

    /**
     * 获取药品规格 1g*30袋/盒
     *
     * @return drup_spec - 药品规格 1g*30袋/盒
     */
    public String getDrupSpec() {
        return drupSpec;
    }

    /**
     * 设置药品规格 1g*30袋/盒
     *
     * @param drupSpec 药品规格 1g*30袋/盒
     */
    public void setDrupSpec(String drupSpec) {
        this.drupSpec = drupSpec;
    }

    /**
     * 获取产品剂型 颗粒、药片、药液
     *
     * @return drup_agent - 产品剂型 颗粒、药片、药液
     */
    public String getDrupAgent() {
        return drupAgent;
    }

    /**
     * 设置产品剂型 颗粒、药片、药液
     *
     * @param drupAgent 产品剂型 颗粒、药片、药液
     */
    public void setDrupAgent(String drupAgent) {
        this.drupAgent = drupAgent;
    }

    /**
     * 获取生产企业
     *
     * @return drup_manu - 生产企业
     */
    public String getDrupManu() {
        return drupManu;
    }

    /**
     * 设置生产企业
     *
     * @param drupManu 生产企业
     */
    public void setDrupManu(String drupManu) {
        this.drupManu = drupManu;
    }

    /**
     * 获取批准文号
     *
     * @return approval_num - 批准文号
     */
    public String getApprovalNum() {
        return approvalNum;
    }

    /**
     * 设置批准文号
     *
     * @param approvalNum 批准文号
     */
    public void setApprovalNum(String approvalNum) {
        this.approvalNum = approvalNum;
    }

    /**
     * 获取条形码
     *
     * @return bar_code - 条形码
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * 设置条形码
     *
     * @param barCode 条形码
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    /**
     * 获取药品图片
     *
     * @return drup_pic - 药品图片
     */
    public String getDrupPic() {
        return drupPic;
    }

    /**
     * 设置药品图片
     *
     * @param drupPic 药品图片
     */
    public void setDrupPic(String drupPic) {
        this.drupPic = drupPic;
    }
}