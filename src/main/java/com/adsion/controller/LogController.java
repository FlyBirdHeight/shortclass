package com.adsion.controller;

import com.adsion.bean.Log;
import com.adsion.bean.Message;
import com.adsion.bean.SeachLog;
import com.adsion.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/log/")
public class LogController {
    @Autowired
    private LogService logService;

    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public Message getAll(@RequestBody SeachLog seachLog){
        try{
            List<Log> logs = logService.getAll(seachLog);
            System.out.println(logs);
            return new Message(1,"SUCCESS",logs);
        }catch (Exception e){
            return new Message(0,"ERROR",null);
        }
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Message insert(@RequestBody Log log){
        try {
            if(logService.insert(log)){
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
    public Message deleteById(@RequestBody int[] logs){
        try {
            if(logService.deleteById(logs)){
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
    public Message get(@RequestBody SeachLog seachLog){
        try{
            List<Log> logs = logService.seachLog(seachLog);
            System.out.println(logs);
            return new Message(1,"SUCCESS",logs);
        }catch (Exception e){
            return new Message(0,"ERROR",null);
        }
    }
}
