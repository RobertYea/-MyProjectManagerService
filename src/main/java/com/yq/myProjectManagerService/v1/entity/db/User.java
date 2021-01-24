package com.yq.myProjectManagerService.v1.entity.db;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * User
 *
 * @author yeqing
 * @version 1.0
 * @date 2021/01/16
 */
@Data
public class User {

    private int id;

    private String uuid;

    @TableField("user_name")
    private String userName;

    private String password;

}
