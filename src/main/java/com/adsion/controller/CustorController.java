package com.adsion.controller;

import com.adsion.bean.Custor;
import com.adsion.bean.Message;
import com.adsion.bean.SeachCustor;
import com.adsion.bean.User;
import com.adsion.service.CustorService;
import com.adsion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/custor/")
public class CustorController {
    @Autowired
    private CustorService custorService;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public Message getAll(@RequestBody SeachCustor seachCustor){
        try{
            List<Custor> custors = custorService.getAll(seachCustor);
            System.out.println(custors);
            return new Message(1,"SUCCESS",custors);
        }catch (Exception e){
            return new Message(0,"ERROR",null);
        }
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Message insert(@RequestBody Custor custor){
        try {
            if(custorService.insert(custor)){
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
    public Message deleteById(@RequestBody int[] custors){
        try {
            if(custorService.deleteById(custors)){
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
    public Message get(@RequestBody SeachCustor seachCustor){
        try{
            List<Custor> custors = custorService.seachCustor(seachCustor);
            for (Custor custor: custors){
                User user = userService.getById(custor.getUser_id());
                custor.setUser_name(user.getName());
            }
            int count = custorService.seachCustorCount(seachCustor);
            Message message = new Message(1,"SUCCESS",custors);
            message.setCount(count);
            return message;
        }catch (Exception e){
            return new Message(0,"ERROR",null);
        }
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Message updateRole(@RequestBody Custor custor){
        try {
            if(custorService.updateCustor(custor)){
                return new Message(1,"SUCCESS",true);
            }else{
                return new Message(0,"ERROR",false);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new Message(0,"ERROR",false);
        }
    }

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public Message findAll(){
        try{
            List<Custor> custors = custorService.findAll();
            System.out.println(custors);
            return new Message(1,"SUCCESS",custors);
        }catch (Exception e){
            return new Message(0,"ERROR",null);
        }
    }
}
