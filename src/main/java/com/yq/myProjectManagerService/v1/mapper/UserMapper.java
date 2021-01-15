package com.yq.myProjectManagerService.v1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yq.myProjectManagerService.v1.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserMapper
 *
 * @author yeqing
 * @version 1.0
 * @date 2021/01/16
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    List<User> list();
}
