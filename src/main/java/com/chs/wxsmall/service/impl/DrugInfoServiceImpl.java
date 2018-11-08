package com.chs.wxsmall.service.impl;

import com.chs.wxsmall.mapper.DrugInfoMapper;
import com.chs.wxsmall.model.DrugInfo;
import com.chs.wxsmall.model.request.DrugInfoRequest;
import com.chs.wxsmall.service.DrugInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.text.MessageFormat;
import java.util.List;
import java.util.UUID;

@Log4j2
@Service
public class DrugInfoServiceImpl implements DrugInfoService{

    @Autowired
    private DrugInfoMapper drugInfoMapper;

    @Override
    public DrugInfo queryOne(String id) {

        return drugInfoMapper.selectByPrimaryKey(id);

    }

    @Override
    public PageInfo<DrugInfo> pageRuleUsers(DrugInfoRequest request) {
        Example example = new Example(DrugInfo.class);
        Example.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotBlank(request.getDrugCnName())) {
            criteria.andLike("drugCnName", MessageFormat.format("%{0}%", request.getDrugCnName()));
        }

        if (StringUtils.isNotBlank(request.getDrugEnName())) {
            criteria.andLike("drugEnName", MessageFormat.format("%{0}%", request.getDrugEnName()));
        }

        PageHelper.startPage(request.getCurrentPage(), request.getPageSize());
        List<DrugInfo> drugInfoList = drugInfoMapper.selectByExample(example);

        PageInfo<DrugInfo> pageInfo = new PageInfo<>(drugInfoList);

        return pageInfo;
    }

    @Override
    public DrugInfo addRuleUser(DrugInfoRequest request) {

        DrugInfo drugInfo = new DrugInfo();

        try {
            BeanUtils.copyProperties(request, drugInfo);
            String id = UUID.randomUUID().toString();
            drugInfo.setDrupId(id);

            int count = drugInfoMapper.insertSelective(drugInfo);

            if (count <= 0) {
                throw new RuntimeException("插入药品数据失败！");
            }

            return drugInfo;

        } catch (BeansException e) {
            log.error("插入药品数据失败！", e);
            throw new RuntimeException("插入药品数据失败！");
        }
    }
}
