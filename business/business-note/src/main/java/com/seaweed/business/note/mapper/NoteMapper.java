package com.seaweed.business.note.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seaweed.business.note.api.entity.Note;
import org.apache.ibatis.annotations.Mapper;

/**
 * Note Mapper
 *
 * @author lyk
 * @version 1.0
 * @date 2020/1/19 14:29
 */
@Mapper
public interface NoteMapper extends BaseMapper<Note> {
}
