package com.yq.myProjectManagerService.v1.controller;

import com.yq.myProjectManagerService.v1.entity.db.Project;
import com.yq.myProjectManagerService.v1.entity.vo.ResultBean;
import com.yq.myProjectManagerService.v1.service.ProjectService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ProjectController
 *
 * @author yeqing
 * @version 1.0
 * @date 2021/01/18
 */
@RestController
@CrossOrigin
@RequestMapping("/v1/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    /**
     * 根据用户Id获取该用户的项目
     *
     * @param userId 用户Id
     * @return ResultBean
     */
    @ApiOperation("根据用户Id获取该用户的项目")
    @GetMapping("/getProjectsByUserId")
    public ResultBean getProjectsByUserId(Integer userId) {
        List<Project> list = projectService.getProjectsByUserId(userId);
        return ResultBean.makeResult(true, "", list);
    }

    /**
     * 保存单个project
     *
     * @param project 项目
     * @return ResultBean
     */
    @ApiOperation("")
    @PostMapping("/save")
    public ResultBean save(Project project) {
        boolean flag = projectService.save(project);
        return ResultBean.makeResult(flag, "", null);
    }
}
