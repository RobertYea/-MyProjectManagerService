package com.yq.myProjectManagerService.v1.entity.db;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;
import java.util.Objects;

/**
 * Project
 *
 * @author yeqing
 * @version 1.0
 * @date 2021/01/18
 */
@Data
public class Project {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    @TableField("create_time")
    private Date createTime;

    @TableField("modify_time")
    private Date modifyTime;

    @TableField("user_id")
    private int userId;

    public Project() {
    }

    public Project(Integer id, String name, Date createTime, Date modifyTime, int userId) {
        this.id = id;
        this.name = name;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return userId == project.userId &&
                Objects.equals(id, project.id) &&
                Objects.equals(name, project.name) &&
                Objects.equals(createTime, project.createTime) &&
                Objects.equals(modifyTime, project.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, createTime, modifyTime, userId);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", userId=" + userId +
                '}';
    }
}
