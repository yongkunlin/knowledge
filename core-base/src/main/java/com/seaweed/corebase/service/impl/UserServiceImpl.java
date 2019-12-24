package com.seaweed.corebase.service.impl;

import com.seaweed.common.mybatis.base.BaseServiceImpl;
import com.seaweed.corebase.mapper.UserMapper;
import com.seaweed.corebase.service.UserService;
import com.seaweed.corebaseapi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;
}
