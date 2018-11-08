package com.chs.wxsmall.controller;

import com.chs.wxsmall.entity.DrugInfo;
import com.chs.wxsmall.model.response.DrugInfoResponse;
import com.chs.wxsmall.service.IDrugInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chs on 2018/11/2.
 */
@Api(value = "药品接口")
@Log4j2
@RestController
@RequestMapping("/drug")
public class DrugInfoController {

    @Autowired
    private IDrugInfoService drugInfoService;

    @ApiOperation(value = "获取药品", notes = "根据id查询药品信息")
    @ApiImplicitParam(name = "drupId", value = "药品id", required=true, dataType = "String")
    @ResponseBody
    @RequestMapping(value = "/queryDrug", method = RequestMethod.GET)
    public DrugInfoResponse queryDrugInfo(@RequestParam("drupId") String drupId) {
        DrugInfoResponse resp = new DrugInfoResponse();
        try {
            DrugInfo drugInfo = drugInfoService.getById(drupId);
            BeanUtils.copyProperties(resp, drugInfo);
            return resp;
        } catch (Exception e) {
            log.error("查询药品失败！", e);
            throw new RuntimeException("查询药品失败！", e);
        }

    }
}
