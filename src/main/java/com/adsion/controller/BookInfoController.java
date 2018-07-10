package com.adsion.controller;

import com.adsion.bean.BookInfo;
import com.adsion.bean.Message;
import com.adsion.bean.SeachBook;
import com.adsion.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book/")
public class BookInfoController {
    @Autowired
    private BookInfoService bookInfoService;

    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public Message getAll(@RequestBody SeachBook seachBook){
        try{
            List<BookInfo> users = bookInfoService.getAll(seachBook);
            System.out.println(users);
            return new Message(1,"SUCCESS",users);
        }catch (Exception e){
            return new Message(0,"ERROR",null);
        }
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Message insert(@RequestBody BookInfo bookInfo){
        try {
            if(bookInfoService.insert(bookInfo)){
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
    public Message deleteById(@RequestBody int[] bookInfos){
        try {
            if(bookInfoService.deleteById(bookInfos)){
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
    public Message updateRole(@RequestBody SeachBook seachBook){
        try{
            List<BookInfo> bookInfos = bookInfoService.seachBook(seachBook);
            System.out.println(bookInfos);
            return new Message(1,"SUCCESS",bookInfos);
        }catch (Exception e){
            return new Message(0,"ERROR",null);
        }
    }
}
