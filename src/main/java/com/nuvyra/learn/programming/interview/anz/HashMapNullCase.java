package com.nuvyra.learn.programming.interview.anz;

import java.util.HashMap;
import java.util.Map;

/* 
predict the output
*/

public class HashMapNullCase {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put(null, null);
        map.put(null, "java");

        System.out.println(map);

        Map<String, String> map2 = new HashMap<>();
        map2.put("name", null);
        map2.put("name", "java");

        System.out.println(map2);

    
    }

}
