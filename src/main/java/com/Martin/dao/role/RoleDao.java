package com.Martin.dao.role;

import com.Martin.pojo.Role;

import java.sql.Connection;
import java.util.List;

public interface RoleDao {
    //获取角色表
    public List<Role> getRoleList(Connection connection) throws Exception;
}
