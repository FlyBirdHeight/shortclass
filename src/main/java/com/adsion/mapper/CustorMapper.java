package com.adsion.mapper;

import com.adsion.bean.Custor;
import com.adsion.bean.SeachCustor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustorMapper {
    List<Custor> getAll(SeachCustor seachCustor) throws Exception;

    void insert(Custor custor) throws Exception;

    void deleteById(int id) throws Exception;

    List<Custor> seachCustor(SeachCustor seachCustor) throws Exception;

    void updateCustor(Custor custor) throws Exception;

    List<Custor> findAll() throws Exception;

    int seachCustorCount(SeachCustor seachCustor) throws Exception;

    Custor getById(int id) throws Exception;
}
