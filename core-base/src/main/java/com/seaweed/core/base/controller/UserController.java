package com.seaweed.core.base.controller;

import com.seaweed.common.exception.base.BusinessException;
import com.seaweed.common.tool.result.Result;
import com.seaweed.core.base.api.entity.User;
import com.seaweed.core.base.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lyk
 * 用户管理
 */
@RestController
@RequestMapping("user")
@Api(value = "用户", tags = "用户接口")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("name")
    public Result<String> getName() {
        return Result.data("user-name");
    }

    @PostMapping(value = "list")
    @ApiOperation(value = "列表", notes = "使用mybatisplus自带的list方法")
    public Result<List<User>> list(@RequestBody User user) {
        throw new BusinessException("测试异常");
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        List<User> list = userService.list(queryWrapper);
//        return Result.data(list);
    }
}
