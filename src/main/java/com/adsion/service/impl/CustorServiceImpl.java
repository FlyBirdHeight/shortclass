package com.adsion.service.impl;

import com.adsion.bean.Custor;
import com.adsion.bean.SeachCustor;
import com.adsion.mapper.CustorMapper;
import com.adsion.service.CustorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustorServiceImpl implements CustorService {
    @Autowired
    private CustorMapper custorMapper;

    @Override
    public List<Custor> getAll(SeachCustor seachCustor) throws Exception {
        try{
            List<Custor> custors = custorMapper.getAll(seachCustor);
            if(custors != null){
                return custors;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean insert(Custor custor) throws Exception {
        try {
            if (custor.getName()!=""){
                custorMapper.insert(custor);
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
    public boolean deleteById(int[] custors) throws Exception {
        try{
            for (int i=0;i<custors.length;i++){
                custorMapper.deleteById(custors[i]);
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Custor> seachCustor(SeachCustor seachCustor) throws Exception {
        try{
            List<Custor> custors = custorMapper.seachCustor(seachCustor);
            if(custors != null){
                return custors;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean updateCustor(Custor custor) throws Exception {
        try{
            custorMapper.updateCustor(custor);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Custor> findAll() throws Exception {
        try{
            List<Custor> custors = custorMapper.findAll();
            if(custors != null){
                return custors;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int seachCustorCount(SeachCustor seachCustor) throws Exception {
        try{
            int custors = custorMapper.seachCustorCount(seachCustor);
            return custors;
        }catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public Custor getById(int id) throws Exception {
        try{
            Custor custor = custorMapper.getById(id);
            if (custor!=null){
                return custor;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
