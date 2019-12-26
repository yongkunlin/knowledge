package com.seaweed.core.base.service.impl;

import com.seaweed.common.mybatis.base.BaseServiceImpl;
import com.seaweed.core.base.mapper.UserMapper;
import com.seaweed.core.base.service.UserService;
import com.seaweed.core.base.api.entity.User;
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
