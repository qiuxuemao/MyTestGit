package com.jd;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("name","fanyinchen");
        map.put("age","2");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "_" + entry.getValue());

        }
        // 20200523修改
        String name = map.get("name");
        System.out.println(name);

        // 赵普
        System.out.println("haha");
        System.out.println("haha");
        System.out.println("haha");
        System.out.println("haha");

    }
}
