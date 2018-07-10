package com.adsion.service;

import com.adsion.bean.Role;

import java.util.List;

public interface RoleService {
    Role getById(int id) throws Exception;

    List<Role> getAll() throws Exception;

}
