/**药品信息表**/
drop table drug_info;
create table drug_info
(
       drup_id             varchar(50)         comment'药品信息表ID'
      ,drug_brand          varchar(50)         comment'药品品牌名称'
      ,drug_cn_name        varchar(50)         comment'药品中文名称'
      ,drug_en_name        varchar(50)         comment'药品英文名称'
      ,drup_type           varchar(50)         comment'药品类别 处方药、非处方药'
      ,drup_spec           varchar(50)         comment'药品规格 1g*30袋/盒'
      ,drup_agent          varchar(20)         comment'产品剂型 颗粒、药片、药液'
      ,drup_manu           varchar(200)        comment'生产企业'
      ,approval_num        varchar(50)         comment'批准文号'
      ,bar_code            varchar(50)         comment'条形码'
      ,drup_pic            varchar(200)        comment'药品图片'  
);
/**家里库存信息表**/
create table home_stock
(
       stock_id            varchar(50)         comment'药品库存表ID'
      ,drup_id             varchar(50)         comment'药品信息表ID'
      ,product_start_date  varchar(50)         comment'生产日期'
      ,product_end_date    varchar(50)         comment'生产结束日期'
      ,validity_date       varchar(50)         comment'有效期'
      ,surplus_num         varchar(50)         comment'剩余数量'
);

/**药品价格信息表**/
create table drup_price
(
       price_id            varchar(50)         comment'价格ID'
      ,drup_id             varchar(50)         comment'药品信息表ID'
      ,store_id            varchar(200)        comment'购买地ID'
      ,buy_store           varchar(200)        comment'购买地'
      ,price               varchar(50)         comment'价格' 
);

/**药品店信息表**/
create table store_info
(
       store_id            varchar(50)         comment'购买地ID'
      ,store_name          varchar(300)        comment'店名称'
);



/**********************************************功能查询SQL**************************/
/**首页面**/
select
         a.drup_id     
        ,a.drug_brand  
        ,a.drug_cn_name
        ,a.drug_en_name
        ,a.drup_type   
        ,a.drup_spec   
        ,a.drup_agent  
        ,a.drup_manu   
        ,a.approval_num
        ,a.bar_code    
        ,a.drup_pic          
        ,b.drup_id    
        ,sum(b.surplus_num)  /**剩余总数量**/
 from
         drug_info   a
left join
         home_stock  b
       on a.drup_id = b.drup_id  
/**药箱详细页面**/

/**家庭剩余详细**/
select
         a.drup_id     
        ,a.drug_brand  
        ,a.drug_cn_name
        ,a.drug_en_name
        ,a.drup_type   
        ,a.drup_spec   
        ,a.drup_agent  
        ,a.drup_manu   
        ,a.approval_num
        ,a.bar_code    
        ,a.drup_pic          
        ,b.drup_id           
        ,b.product_start_date
        ,b.product_end_date  
        ,b.validity_date     
        ,b.surplus_num       
 from
         drug_info   a
left join
         home_stock  b
       on a.drup_id = b.drup_id  
where 
       a.a.drup_id=?

/**各地价格详细**/    
select
         a.drup_id     
        ,a.drug_brand  
        ,a.drug_cn_name
        ,a.drug_en_name
        ,a.drup_type   
        ,a.drup_spec   
        ,a.drup_agent  
        ,a.drup_manu   
        ,a.approval_num
        ,a.bar_code    
        ,a.drup_pic          
        ,c.store_id  
        ,c.store_name
        ,b.price_id 
        ,b.drup_id  
        ,b.store_id 
        ,b.buy_store
        ,b.price    

 from
         drug_info   a
left join 
         drup_price  b
      on a.drup_id = b.drup_id
left join 
         store_info  c
      on b.store_id = c.store_id
where 
      a.a.drup_id=?




生产企业


品牌
分类
疾病
症状


用法
药品分类
有效期
使用剂量



有效结束日期
药品图片
