package com.adsion.service.impl;

import com.adsion.bean.Chat;
import com.adsion.bean.SeachChat;
import com.adsion.mapper.ChatMapper;
import com.adsion.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ChatServiceImpl implements ChatService {
    @Autowired
    private ChatMapper chatMapper;

    @Override
    public List<Chat> getAll(SeachChat seachChat) throws Exception {
        try{
            List<Chat> chats = chatMapper.getAll(seachChat);
            if(chats != null){
                return chats;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean insert(Chat chat) throws Exception {
        try {
            if (chat.getCust_id()!=0&&chat.getName()!=""){
                chatMapper.insert(chat);
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteById(int[] chats) throws Exception {
        try{
            for (int i=0;i<chats.length;i++){
                chatMapper.deleteById(chats[i]);
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Chat> seachChat(SeachChat seachChat) throws Exception {
        try{
            List<Chat> chats = chatMapper.seachChat(seachChat);
            if(chats != null){
                return chats;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
