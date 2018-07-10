package com.adsion.service;

import com.adsion.bean.Log;
import com.adsion.bean.SeachLog;

import java.util.List;

public interface LogService {
    List<Log> getAll(SeachLog seachLog) throws Exception;

    boolean insert(Log log) throws Exception;

    boolean deleteById(int[] logs) throws Exception;

    List<Log> seachLog(SeachLog seachLog) throws Exception;
}
