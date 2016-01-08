package com.example.androidtest;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MD5Utils {

	  public    static String sortParam(List keyList,Map map){
	        String md5_param = "";
	        //sort before
	        System.out.println(keyList);
	        Collections.sort(keyList);
	        //sort after
	        System.out.println(keyList);
	        for(int i=0;i<keyList.size();i++){
	            md5_param += map.get(keyList.get(i));
	        }
	        return md5_param;
	     }

}
