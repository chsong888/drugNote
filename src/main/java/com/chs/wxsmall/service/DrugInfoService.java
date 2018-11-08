package com.chs.wxsmall.service;

import com.chs.wxsmall.model.DrugInfo;
import com.chs.wxsmall.model.request.DrugInfoRequest;
import com.github.pagehelper.PageInfo;

public interface DrugInfoService {
    DrugInfo queryOne(String id);

    PageInfo<DrugInfo> pageRuleUsers(DrugInfoRequest request);

    DrugInfo addRuleUser(DrugInfoRequest request);
}
