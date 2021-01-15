package com.yq.myProjectManagerService.v1.controller;

import com.yq.myProjectManagerService.v1.entity.User;
import com.yq.myProjectManagerService.v1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController
 *
 * @author yeqing
 * @version 1.0
 * @date 2021/01/16
 */
@RestController
@CrossOrigin
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> list() {
        List<User> list = userService.list();
        return list;
    }
}
