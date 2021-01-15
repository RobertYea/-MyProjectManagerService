package com.yq.myProjectManagerService.v1.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * User
 *
 * @author yeqing
 * @version 1.0
 * @date 2021/01/16
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String uuid;

    @TableField("userName")
    private String userName;

    private String password;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(int id, String uuid, String userName, String password) {
        this.id = id;
        this.uuid = uuid;
        this.userName = userName;
        this.password = password;
    }
}
