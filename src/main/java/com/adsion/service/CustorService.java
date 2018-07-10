package com.adsion.service;

import com.adsion.bean.Custor;
import com.adsion.bean.SeachCustor;

import java.util.List;

public interface CustorService {
    List<Custor> getAll(SeachCustor seachCustor) throws Exception;

    boolean insert(Custor custor) throws Exception;

    boolean deleteById(int[] custors) throws Exception;

    List<Custor> seachCustor(SeachCustor seachCustor) throws Exception;

    boolean updateCustor(Custor custor) throws Exception;

    List<Custor> findAll() throws Exception;
}
