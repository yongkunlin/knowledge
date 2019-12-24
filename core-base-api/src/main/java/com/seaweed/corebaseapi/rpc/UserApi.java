package com.seaweed.corebaseapi.rpc;

import com.seaweed.common.mybatis.constant.AppConstant;
import com.seaweed.common.mybatis.tool.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = AppConstant.APPLICATION_BASE_API)
public interface UserApi {

    @GetMapping("name")
    Result<String> getName();
}
