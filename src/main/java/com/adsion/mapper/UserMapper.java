package com.adsion.mapper;

import com.adsion.bean.SeachUser;
import com.adsion.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAll(SeachUser seachUser) throws Exception;

    void insert(User user) throws Exception;

    void deleteById(int id) throws Exception;

    List<User> seachUser(SeachUser seachUser) throws Exception;

    void updateUser(User user) throws Exception;

    User findName(User user) throws Exception;

    List<User> findAll() throws Exception;

    int seachUserCount(SeachUser seachUser) throws Exception;

    User getById(int id) throws Exception;
}
