package com.seaweed.corebase.service.impl;

import com.seaweed.common.mybatis.base.BaseServiceImpl;
import com.seaweed.corebase.mapper.UserMapper;
import com.seaweed.corebase.service.UserService;
import com.seaweed.corebaseapi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 *
 * @author lyk
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {
    @SuppressWarnings("all")
    @Autowired
    private UserMapper userMapper;
}
