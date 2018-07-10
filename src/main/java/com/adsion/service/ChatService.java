package com.adsion.service;

import com.adsion.bean.Chat;
import com.adsion.bean.SeachChat;

import java.util.List;

public interface ChatService {
    List<Chat> getAll(SeachChat seachChat) throws Exception;

    boolean insert(Chat chat) throws Exception;

    boolean deleteById(int[] chats) throws Exception;

    List<Chat> seachChat(SeachChat seachChat) throws Exception;
}
