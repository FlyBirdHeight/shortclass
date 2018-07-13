package com.adsion.service.impl;

import com.adsion.bean.Log;
import com.adsion.bean.SeachLog;
import com.adsion.mapper.LogMapper;
import com.adsion.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LogServiceImpl implements LogService {
    @Autowired
    private LogMapper logMapper;

    @Override
    public List<Log> getAll(SeachLog seachLog) throws Exception {
        try{
            List<Log> logs = logMapper.getAll(seachLog);
            if(logs != null){
                return logs;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean insert(Log log) throws Exception {
        try {
            if (log.getTitle()!=""&&log.getDescription()!=""){
                logMapper.insert(log);
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
    public boolean deleteById(int[] logs) throws Exception {
        try{
            for (int i=0;i<logs.length;i++){
                logMapper.deleteById(logs[i]);
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("删除失败");
        }
    }

    @Override
    public List<Log> seachLog(SeachLog seachLog) throws Exception {
        try{
            List<Log> logs = logMapper.seachLog(seachLog);
            if(logs != null){
                return logs;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int seachLogCount(SeachLog seachLog) throws Exception {
        try{
            int logs = logMapper.seachLogCount(seachLog);
            return logs;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }

    }
}
