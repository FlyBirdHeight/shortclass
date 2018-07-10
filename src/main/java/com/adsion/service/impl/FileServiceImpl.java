package com.adsion.service.impl;

import com.adsion.bean.File;
import com.adsion.bean.SeachFile;
import com.adsion.mapper.FileMapper;
import com.adsion.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FileServiceImpl implements FileService {
    @Autowired
    private FileMapper fileMapper;

    @Override
    public List<File> getAll(SeachFile seachFile) throws Exception {
        try{
            List<File> files = fileMapper.getAll(seachFile);
            if(files != null){
                return files;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean insert(File file) throws Exception {
        try {
            if (file.getUrl()!=""&&file.getTitle()!=""){
                fileMapper.insert(file);
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
    public boolean deleteById(int[] files) throws Exception {
        try{
            for (int i=0;i<files.length;i++){
                fileMapper.deleteById(files[i]);
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<File> seachFile(SeachFile seachFile) throws Exception {
        try{
            List<File> files = fileMapper.seachFile(seachFile);
            if(files != null){
                return files;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public File getById(int id) throws Exception {
        try{
            File file = fileMapper.getById(id);
            if(file!=null){
                return file;
            }else{
                return null;
            }
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
