package com.seaweed.business.note.service.impl;

import com.seaweed.business.note.api.entity.Note;
import com.seaweed.business.note.mapper.NoteMapper;
import com.seaweed.business.note.service.NoteService;
import com.seaweed.common.mybatis.base.BaseServiceImpl;
import com.seaweed.common.tool.result.Result;
import com.seaweed.core.base.api.entity.User;
import com.seaweed.core.base.api.rpc.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Note Service Impl
 *
 * @author lyk
 * @version 1.0
 * @date 2020/1/19 13:58
 */
@Service
public class NoteServiceImpl extends BaseServiceImpl<NoteMapper, Note> implements NoteService {

    @SuppressWarnings("all")
    @Autowired
    private NoteMapper noteMapper;

    @SuppressWarnings("all")
    @Autowired
    private UserApi userApi;

    @Override
    public Result<String> getName() {
        return userApi.getName();
    }

    @Override
    public Result<List<User>> listUser() {
        return userApi.list(new User());
    }
}
