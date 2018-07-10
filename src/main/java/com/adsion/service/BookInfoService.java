package com.adsion.service;

import com.adsion.bean.BookInfo;
import com.adsion.bean.SeachBook;

import java.util.List;

public interface BookInfoService {
    List<BookInfo> getAll(SeachBook seachBook) throws Exception;

    boolean insert(BookInfo bookInfo) throws Exception;

    boolean deleteById(int[] bookInfos) throws Exception;

    List<BookInfo> seachBook(SeachBook seachBook) throws Exception;
}
