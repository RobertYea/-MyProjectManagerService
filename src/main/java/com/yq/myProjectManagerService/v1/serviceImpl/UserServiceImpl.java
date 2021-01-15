package com.yq.myProjectManagerService.v1.serviceImpl;

import com.yq.myProjectManagerService.v1.entity.User;
import com.yq.myProjectManagerService.v1.mapper.UserMapper;
import com.yq.myProjectManagerService.v1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl
 *
 * @author yeqing
 * @version 1.0
 * @date 2021/01/16
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        List<User> list = userMapper.selectList(null);
        return list;
    }
}
