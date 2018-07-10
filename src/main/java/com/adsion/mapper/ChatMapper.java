package com.adsion.mapper;

import com.adsion.bean.Chat;
import com.adsion.bean.SeachChat;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChatMapper {
    List<Chat> getAll(SeachChat seachChat) throws Exception;

    void insert(Chat chat) throws Exception;

    void deleteById(int id) throws Exception;

    List<Chat> seachChat(SeachChat seachChat) throws Exception;
}
