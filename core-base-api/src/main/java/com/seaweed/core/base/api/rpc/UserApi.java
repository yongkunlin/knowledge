package com.seaweed.core.base.api.rpc;

import com.seaweed.common.mybatis.constant.AppConstant;
import com.seaweed.common.mybatis.tool.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 用户外部调用api
 *
 * @author lyk
 */

@FeignClient(value = AppConstant.APPLICATION_BASE)
public interface UserApi {

    /**
     * 测试是否畅通
     *
     * @return 测试结果
     */
    @GetMapping("/user/name")
    Result<String> getName();
}
