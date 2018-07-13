package com.adsion.mapper;

import com.adsion.bean.Log;
import com.adsion.bean.SeachLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LogMapper {
    List<Log> getAll(SeachLog seachLog) throws Exception;

    void insert(Log log) throws Exception;

    void deleteById(int id) throws Exception;

    List<Log> seachLog(SeachLog seachLog) throws Exception;

    int seachLogCount(SeachLog seachLog) throws Exception;
}
