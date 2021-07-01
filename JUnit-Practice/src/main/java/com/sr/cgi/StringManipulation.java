package com.sr.cgi;

import java.util.HashSet;

public class StringManipulation {


    public static int vowelCount(String str){
        if (str==null||str.trim().isEmpty()){
            return 0;
        }
        int count=0;
        HashSet<Character> h = new HashSet<>();
        h.add('a'); h.add('e'); h.add('i'); h.add('o'); h.add('u');
        h.add('A'); h.add('E'); h.add('I'); h.add('O'); h.add('U');
        for (int i=0;i<str.length();i++){
            if (h.contains(str.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public static int characterCount(String str){
        if (str==null||str.trim().isEmpty()){
            return 0;
        }
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }
}
