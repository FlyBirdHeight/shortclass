package com.adsion.controller;

import com.adsion.bean.Chat;
import com.adsion.bean.Custor;
import com.adsion.bean.Message;
import com.adsion.bean.SeachChat;
import com.adsion.service.ChatService;
import com.adsion.service.CustorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chat/")
public class ChatController {
    @Autowired
    private ChatService chatService;
    @Autowired
    private CustorService custorService;

    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public Message getAll(@RequestBody SeachChat seachChat){
        try{
            List<Chat> users = chatService.getAll(seachChat);
            System.out.println(users);
            return new Message(1,"SUCCESS",users);
        }catch (Exception e){
            return new Message(0,"ERROR",null);
        }
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Message insert(@RequestBody Chat chat){
        try {
            if(chatService.insert(chat)){
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
    public Message deleteById(@RequestBody int[] chats){
        try {
            if(chatService.deleteById(chats)){
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
    public Message updateRole(@RequestBody SeachChat seachChat){
        try{
            System.out.println(seachChat.toString());
            List<Chat> chats = chatService.seachChat(seachChat);
            int count = chatService.seachChatCount(seachChat);
            for (Chat chat: chats){
                Custor custor = custorService.getById(chat.getCust_id());
                chat.setCust_bame(custor.getName());
            }
            Message message = new Message(1,"SUCCESS",chats);
            message.setCount(count);
            return message;
        }catch (Exception e){
            return new Message(0,"ERROR",null);
        }
    }
}
