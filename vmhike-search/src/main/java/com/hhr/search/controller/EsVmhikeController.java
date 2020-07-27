package com.hhr.search.controller;

import com.hhr.search.service.EsVmhikeService;
import com.hhr.vmhike.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "EsVmhikeController",description = "搜索服务")
@RequestMapping("/esVmhike")
public class EsVmhikeController {

    @Autowired
    private EsVmhikeService esVmhikeService;

    @ApiOperation("导入数据库中所有数据到ES")
    @PostMapping("/importAll")
    public CommonResult<Integer> importAllDate(){
        int count = esVmhikeService.importAll();
        return CommonResult.success(count);
    }
}
