package com.adsion.mapper;

import com.adsion.bean.BookInfo;
import com.adsion.bean.SeachBook;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface BookInfoMapper {
    List<BookInfo> getAll(SeachBook seachBook) throws Exception;

    void insert(BookInfo bookInfo) throws Exception;

    void deleteById(int id) throws Exception;

    List<BookInfo> seachBook(SeachBook seachBook) throws Exception;

    int seachBookCount(SeachBook seachBook) throws Exception;
}
