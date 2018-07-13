package com.adsion.service;

import com.adsion.bean.File;
import com.adsion.bean.SeachFile;

import java.util.List;

public interface FileService {
    List<File> getAll(SeachFile seachFile) throws Exception;

    boolean insert(File file) throws Exception;

    boolean deleteById(int[] files) throws Exception;

    List<File> seachFile(SeachFile seachFile) throws Exception;

    File getById(int id) throws Exception;

    int seachFileCount(SeachFile seachFile) throws Exception;
}
