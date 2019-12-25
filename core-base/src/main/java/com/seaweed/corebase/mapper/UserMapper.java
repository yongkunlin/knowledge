package com.seaweed.corebase.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seaweed.corebaseapi.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户mapper
 *
 * @author lyk
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
