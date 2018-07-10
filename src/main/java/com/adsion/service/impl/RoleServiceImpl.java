package com.adsion.service.impl;

import com.adsion.bean.Role;
import com.adsion.mapper.RoleMapper;
import com.adsion.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role getById(int id) throws Exception {
        try{
            Role role = roleMapper.getById(id);
            if(role != null){
                return role;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Role> getAll() throws Exception {
        try{
            List<Role> roles = roleMapper.getAll();
            if(roles != null){
                return roles;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
