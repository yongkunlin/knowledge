package com.seaweed.core.base.api.rpc;

import com.seaweed.common.mybatis.constant.AppConstant;
import com.seaweed.common.tool.result.Result;
import com.seaweed.core.base.api.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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

    @PostMapping("/user/list")
    Result<List<User>> list(User user);
}
