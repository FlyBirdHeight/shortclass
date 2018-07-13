package com.adsion.mapper;

import com.adsion.bean.Custor;
import com.adsion.bean.File;
import com.adsion.bean.SeachCustor;
import com.adsion.bean.SeachFile;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface FileMapper {
    List<File> getAll(SeachFile seachFile) throws Exception;

    void insert(File file) throws Exception;

    void deleteById(int id) throws Exception;

    List<File> seachFile(SeachFile seachFile) throws Exception;

    File getById(int id) throws Exception;

    int seachFileCount(SeachFile seachFile) throws Exception;
}
