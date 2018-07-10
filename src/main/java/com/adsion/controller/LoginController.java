package com.adsion.controller;

import com.adsion.bean.Message;
import com.adsion.bean.User;
import com.adsion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/v1/")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Message login(@RequestBody User user, HttpSession session){
        Message message = userService.login(user);
        if(message != null){
            if(message.getStatus() == Message.SUCCESS){
                session.setAttribute("user",message.getResult());
            }
        }
        return message;
    }
}
