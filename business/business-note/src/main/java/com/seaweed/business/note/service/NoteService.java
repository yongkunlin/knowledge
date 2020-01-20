package com.seaweed.business.note.service;

import com.seaweed.business.note.api.entity.Note;
import com.seaweed.common.mybatis.base.BaseService;
import com.seaweed.common.tool.result.Result;
import com.seaweed.core.base.api.entity.User;

import java.util.List;

/**
 * Notes ervice
 *
 * @author lyk
 * @version 1.0
 * @date 2020/1/19 13:57
 */
public interface NoteService extends BaseService<Note> {
    /**
     * 测试
     *
     * @return 测试
     */
    Result<String> getName();

    /**
     * 测试
     *
     * @return 测试
     */
    Result<List<User>> listUser();
}
