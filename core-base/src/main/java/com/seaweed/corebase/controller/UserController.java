package com.seaweed.corebase.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.seaweed.common.mybatis.tool.result.Result;
import com.seaweed.corebase.service.UserService;
import com.seaweed.corebaseapi.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public Result<List<User>> list(User user) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        List<User> list = userService.list(queryWrapper);
        return Result.data(list);
    }
}
