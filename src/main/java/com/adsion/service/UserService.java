package com.adsion.service;

import com.adsion.bean.Message;
import com.adsion.bean.SeachUser;
import com.adsion.bean.User;

import java.lang.reflect.Array;
import java.util.List;

public interface UserService {
    List<User> getAll(SeachUser seachUser) throws Exception;

    boolean insert(User user) throws Exception;

    boolean deleteById(int[] users) throws Exception;

    List<User> seachUser(SeachUser seachUser) throws Exception;

    boolean updateUser(User user) throws Exception;

    boolean findName(User user) throws Exception;

    List<User> findAll() throws Exception;

    Message login(User user);
}
