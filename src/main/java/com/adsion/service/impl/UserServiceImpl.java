package com.adsion.service.impl;

import com.adsion.bean.Message;
import com.adsion.bean.SeachUser;
import com.adsion.bean.User;
import com.adsion.mapper.UserMapper;
import com.adsion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Array;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll(SeachUser seachUser) throws Exception {
        try{
            List<User> users = userMapper.getAll(seachUser);
            if(users != null){
                return users;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean insert(User user) throws Exception {
        try {
            if (user.getName()!=""&&user.getPassword()!=""){
                if (userMapper.findName(user)!=null){
                    return false;
                }else{
                    userMapper.insert(user);
                    return true;
                }
            }else {
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteById(int[] users) throws Exception {
        try{
            for (int i=0;i<users.length;i++){
                userMapper.deleteById(users[i]);
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("删除失败");
        }
    }

    @Override
    public List<User> seachUser(SeachUser seachUser) throws Exception {
        try{
            List<User> users = userMapper.seachUser(seachUser);
            if(users != null){
                return users;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean updateUser(User user) throws Exception {
        try{
            userMapper.updateUser(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean findName(User user) throws Exception {
        try{
            User user1 = userMapper.findName(user);
            if (user1!=null){
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<User> findAll() throws Exception {
        try{
            List<User> users = userMapper.findAll();
            if(users != null){
                return users;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    @Transactional
    public Message login(User user){
        try{
            User user1 = userMapper.findName(user);
            if(user1 != null){
                if (user1.getName().equals(user.getName())&&user1.getPassword().equals(user.getPassword())){
                    return new Message(Message.SUCCESS,"登陆成功", user1);
                }else{
                    return new Message(Message.ERROR,"密码错误",null);
                }
            }else{
                return new Message(Message.ERROR,"用户名不存在",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new Message(Message.ERROR,"登陆异常",null);
        }

    }
}
