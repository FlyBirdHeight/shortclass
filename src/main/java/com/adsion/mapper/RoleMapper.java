package com.adsion.mapper;

import com.adsion.bean.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {
    Role getById(int id) throws Exception;

    List<Role> getAll() throws Exception;
}
