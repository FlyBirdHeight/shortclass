package com.adsion.controller;

import com.adsion.bean.*;
import com.adsion.service.CustorService;
import com.adsion.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/file/")
public class FileController {
    @Autowired
    private FileService fileService;
    @Autowired
    private CustorService custorService;

    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public Message getAll(@RequestBody SeachFile seachFile){
        try{
            List<File> users = fileService.getAll(seachFile);
            System.out.println(users);
            return new Message(1,"SUCCESS",users);
        }catch (Exception e){
            return new Message(0,"ERROR",null);
        }
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Message insert(@RequestBody File file){
        try {
            System.out.println(file.toString());
            if(fileService.insert(file)){
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
    public Message deleteById(@RequestBody int[] files){
        try {
            if(fileService.deleteById(files)){
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
    public Message updateRole(@RequestBody SeachFile seachFile){
        System.out.println(seachFile.toString());
        try{
            List<File> files = fileService.seachFile(seachFile);
            int count = fileService.seachFileCount(seachFile);
            for (File file:files){
                Custor custor = custorService.getById(file.getCust_id());
                file.setCust_name(custor.getName());
            }
            Message message = new Message(1,"SUCCESS",files);
            message.setCount(count);
            return message;
        }catch (Exception e){
            return new Message(0,"ERROR",null);
        }
    }

    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    public Message updateRole(@RequestParam int id){
        try{
            File file = fileService.getById(id);
            System.out.println(file);
            return new Message(1,"SUCCESS",file);
        }catch (Exception e){
            return new Message(0,"ERROR",null);
        }
    }
}
