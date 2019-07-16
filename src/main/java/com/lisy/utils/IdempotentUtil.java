package com.lisy.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * IdempotentUtil
 * 幂等校验工具类
 * @author lishiyong
 **/
public class IdempotentUtil {
    public static final Map<String,Long> CACHE_MAP = new HashMap<>();
    private static final ExecutorService executorService = Executors.newSingleThreadExecutor();
    public static final long OUT_TIME=1000;
    public static final int OUT_SIZE=100;
    //验证是否短时间重复申请
    public static boolean isRepeat(String idNum){
        boolean flag =false;
        //检查是否存在key
        if(CACHE_MAP.containsKey(idNum)){
            if(System.currentTimeMillis()- CACHE_MAP.get(idNum)>OUT_TIME){
                flag= true;
            }else{
                flag= false;
            }
        }else{
            flag= true;
        }
        CACHE_MAP.put(idNum, System.currentTimeMillis());
        //当数量过多做一次清除
        if(CACHE_MAP.size()>OUT_SIZE){
            executorService.execute(() ->{
                for (Map.Entry<String, Long> entry : CACHE_MAP.entrySet() ) {
                    if(System.currentTimeMillis()-entry.getValue()>OUT_TIME){
                        CACHE_MAP.remove(entry.getKey());
                    }
                }
            });
        }
        return flag;
    }
}
