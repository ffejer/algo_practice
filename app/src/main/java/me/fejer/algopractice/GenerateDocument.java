package me.fejer.algopractice;

import java.util.HashMap;

class GenerateDocument {
    public static void main(String[] args) {
        System.out.println(new GenerateDocument().generateDocument("Bste!hetsi ogEAxpelrt x ", "AlgoExpert is the Best!"));
    }
    public boolean generateDocument(String characters, String document) {
        if(document.length() == 0) return true;
        HashMap<Character, Integer> char_map = new HashMap<>();
        for(char currc : characters.toCharArray()) {
            if(char_map.containsKey(currc)) {
                Integer integer = char_map.get(currc);
                char_map.put(currc, ++integer);
            } else {
                char_map.put(currc, 1);
            }
        }
        for(char c : document.toCharArray()) {
            if(!char_map.containsKey(c)) {
                return false;
            } else {
                Integer count = char_map.get(c);
                if(count > 0) {
                    char_map.put(c, --count);
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}

