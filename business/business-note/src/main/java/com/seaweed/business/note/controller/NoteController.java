package com.seaweed.business.note.controller;

import com.seaweed.business.note.service.NoteService;
import com.seaweed.common.tool.result.Result;
import com.seaweed.core.base.api.entity.User;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lyk
 * 笔记管理
 */

@RestController
@RequestMapping("note")
@Api(value = "笔记", tags = "笔记管理")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping("name")
    public Result<String> getName() {
        return noteService.getName();
    }

    @GetMapping("listUser")
    public Result<List<User>> listUser() {
        return noteService.listUser();
    }
}
