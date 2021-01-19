package com.yq.myProjectManagerService.v1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yq.myProjectManagerService.v1.entity.db.Project;

import java.util.List;

/**
 * ProjectService
 *
 * @author yeqing
 * @version 1.0
 * @date 2021/01/18
 */
public interface ProjectService extends IService<Project> {

    List<Project> getProjectsByUserId(Integer userId);

}
