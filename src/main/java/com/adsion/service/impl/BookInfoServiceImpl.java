package com.adsion.service.impl;

import com.adsion.bean.BookInfo;
import com.adsion.bean.SeachBook;
import com.adsion.mapper.BookInfoMapper;
import com.adsion.service.BookInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class BookInfoServiceImpl implements BookInfoService {
    @Autowired
    private BookInfoMapper bookInfoMapper;

    @Override
    public List<BookInfo> getAll(SeachBook seachBook) throws Exception {
        try{
            List<BookInfo> bookInfos = bookInfoMapper.getAll(seachBook);
            if(bookInfos != null){
                return bookInfos;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean insert(BookInfo bookInfo) throws Exception {
        try {
            if (bookInfo.getBook_time()!=""&&bookInfo.getTitle()!=""){
                bookInfoMapper.insert(bookInfo);
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
    public boolean deleteById(int[] bookInfos) throws Exception {
        try{
            for (int i=0;i<bookInfos.length;i++){
                bookInfoMapper.deleteById(bookInfos[i]);
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("删除失败");
        }
    }

    @Override
    public List<BookInfo> seachBook(SeachBook seachBook) throws Exception {
        try{
            List<BookInfo> bookInfos = bookInfoMapper.seachBook(seachBook);
            if(bookInfos != null){
                return bookInfos;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int seachBookCount(SeachBook seachBook) throws Exception {
        try{
            int bookInfos = bookInfoMapper.seachBookCount(seachBook);
            return bookInfos;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }
}

