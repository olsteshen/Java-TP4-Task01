package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class Calculate {

    public <K, V> Map<Character, Integer> calculate (String text){
        char [] arr = text.toLowerCase().toCharArray();
        Map<Character, Integer> voc = new HashMap<>();
        for (char c : arr) {
            if (c >= 'a' && c <= 'z') {
                voc.compute(c, (key, val) -> val == null ? 1 : val + 1);
            }
        }
        System.out.println(voc.entrySet());
        return voc;
    }
}
