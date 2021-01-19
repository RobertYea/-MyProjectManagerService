package com.yq.myProjectManagerService.v1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Maps;
import com.yq.myProjectManagerService.v1.entity.db.Project;
import com.yq.myProjectManagerService.v1.mapper.ProjectMapper;
import com.yq.myProjectManagerService.v1.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * ProjectServiceImpl
 *
 * @author yeqing
 * @version 1.0
 * @date 2021/01/18
 */
@Service
public class ProjectServiceImpl extends ServiceImpl<ProjectMapper, Project> implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public List<Project> getProjectsByUserId(Integer userId) {
        Map<String, Object> map = Maps.newHashMap();
        map.put("user_id", userId);
        List<Project> projects = projectMapper.selectByMap(map);
        return projects;
    }

}
