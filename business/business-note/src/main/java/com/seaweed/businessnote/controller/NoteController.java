package com.seaweed.businessnote.controller;

import com.seaweed.common.mybatis.tool.result.Result;
import com.seaweed.corebaseapi.rpc.UserApi;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lyk
 * 笔记管理
 */

@RestController
@RequestMapping("note")
@Api(value = "笔记", tags = "笔记管理")
public class NoteController {

    @Autowired
    private UserApi userApi;

    @GetMapping("name")
    public Result<String> getName() {
        return userApi.getName();
    }
}
