package com.yq.myProjectManagerService.v1.service;

import com.yq.myProjectManagerService.v1.entity.db.User;

import java.util.List;

/**
 * UserService
 *
 * @author yeqing
 * @version 1.0
 * @date 2021/01/16
 */
public interface UserService {

    List<User> list();
}
