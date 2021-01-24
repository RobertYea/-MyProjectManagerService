package com.yq.myProjectManagerService.v1.entity.db;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

/**
 * Project
 *
 * @author yeqing
 * @version 1.0
 * @date 2021/01/18
 */
@Data
public class Project {

    private Integer id;

    private String name;

    private String description;

    private String status;

    @TableField("create_time")
    private Date createTime;

    @TableField("modify_time")
    private Date modifyTime;

    @TableField("user_id")
    private int userId;

}
