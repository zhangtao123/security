package com.yibo.security.dao;

import com.yibo.security.entity.Resource;
import com.yibo.security.entity.RoleResource;

import java.util.List;

public interface RoleResourceDao {
    int deleteByPrimaryKey(Long id);

    int insert(RoleResource record);

    int insertSelective(RoleResource record);

    RoleResource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleResource record);

    int updateByPrimaryKey(RoleResource record);

    List<Resource> getPermissionsByRoleId(Long roleId);
}