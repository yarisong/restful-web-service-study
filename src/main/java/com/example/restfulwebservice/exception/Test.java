package com.example.restfulwebservice.exception;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Object> myMap1 = new HashMap<>();
        Map<String, Object> myMap2 = new HashMap<>();
 
        Map<Integer, Object> finalMap = new HashMap<>();
 
        myMap1.put("name", "이상현");
        myMap1.put("age", "29");
        myMap1.put("country", "KOREA");
 
        myMap2.put("name", "김철수");
        myMap2.put("age", "25");
        myMap2.put("country", "USA");
 
        List<Map<String,Object>> myList1 = new ArrayList<>();
        myList1.add(myMap1);
        myList1.add(myMap2);
 
        // List foreach 문
        for (Map<String, Object> map : myList1) {
            System.out.println(map);
        }
 
        // lambda사용한 List foreach 문
        myList1.forEach(x -> {
            System.out.println(x);
        });
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").withLocale(Locale.ENGLISH);
        String title = "Channel_2021_03_29_15_09_31_1631_20210811165059_205945";
        
        String[] videoTitleInfoArray = title.split("_");
        
        
        for(int i=0; i< videoTitleInfoArray.length;i++) {
        	
        	System.out.println("videoTitleInfoArray[" + i + "] = " + videoTitleInfoArray[i]  );
        	
        }
        
        LocalDateTime videoTitleTime = LocalDateTime.parse(videoTitleInfoArray[8], formatter);
     
        System.out.println(" videoTitleTime : " + videoTitleTime);
        		
	}

}
