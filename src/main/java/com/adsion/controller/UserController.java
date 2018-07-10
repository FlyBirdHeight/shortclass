package com.adsion.controller;

import com.adsion.bean.Message;
import com.adsion.bean.Role;
import com.adsion.bean.SeachUser;
import com.adsion.bean.User;
import com.adsion.service.RoleService;
import com.adsion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user/")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public Message getAll(@RequestBody SeachUser seachUser){
        try{
            List<User> users = userService.getAll(seachUser);
            System.out.println(users);
            return new Message(1,"SUCCESS",users);
        }catch (Exception e){
            return new Message(0,"ERROR",null);
        }
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Message insert(@RequestBody User user){
        try {
            if(userService.insert(user)){
                return new Message(1,"SUCCESS",true);
            }else{
                return new Message(0,"ERROR",false);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new Message(0,"ERROR",false);
        }
    }

    @RequestMapping(value = "/del",method = RequestMethod.POST)
    public Message deleteById(@RequestBody int[] users){
        try {
            if(userService.deleteById(users)){
                return new Message(1,"SUCCESS",true);
            }else{
                return new Message(0,"ERROR",false);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new Message(0,"ERROR",false);
        }
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Message updateRole(@RequestBody User user){
        System.out.println(user);
        try {
            if(userService.updateUser(user)){
                return new Message(1,"SUCCESS",true);
            }else{
                return new Message(0,"ERROR",false);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new Message(0,"ERROR",false);
        }
    }

    @RequestMapping(value = "/get",method = RequestMethod.POST)
    public Message updateRole(@RequestBody SeachUser seachUser){
        try{
            System.out.println(seachUser);
            List<User> users = userService.seachUser(seachUser);
            System.out.println(users);
            return new Message(1,"SUCCESS",users);
        }catch (Exception e){
            return new Message(0,"ERROR",null);
        }
    }

    @RequestMapping(value = "/getRole",method = RequestMethod.GET)
    public Message getRole(){
        try{
            List<Role> roles = roleService.getAll();
            System.out.println(roles);
            return new Message(1,"SUCCESS",roles);
        }catch (Exception e){
            return new Message(0,"ERROR",null);
        }
    }

    @RequestMapping(value = "/name",method = RequestMethod.POST)
    public Message findName(@RequestBody User user){
        try{
            System.out.println(user.toString());
            if (userService.findName(user)){
                return new Message(1,"SUCCESS",null);
            }else{
                return new Message(0,"ERROR",null);
            }
        }catch (Exception e){
            return new Message(0,"ERROR",null);
        }
    }

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public Message findAll(){
        try{
            List<User> users = userService.findAll();
            return new Message(1,"SUCCESS",users);
        }catch (Exception e){
            return new Message(0,"ERROR",null);
        }
    }
}
