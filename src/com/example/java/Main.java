package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Character, Integer> voc = new HashMap<>();
        String text = "The default implementation of this method takes no guarantees about synchronization or atomic properties of this method";
        char [] arr = text.toLowerCase().toCharArray();
        for (char c : arr) {
            if (c >= 'a' && c <= 'z') {
                voc.compute(c, (key, val) -> val == null ? 1 : val + 1);
            }
        }
        System.out.println(voc.entrySet());
    }
}
