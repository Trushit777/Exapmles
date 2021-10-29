package com.example.main;

import java.util.Map;
import java.util.TreeMap;

public class SimpleWordCounter {

    public static void main(String[] args) {

        String sample = "This is Sample Text for checking Sample Word Count using Map.";
        // sc.useDelimiter("[^a-zA-Z']+");
        Map<String, Integer> wordCount = new TreeMap<String, Integer>();
        String[] sam = sample.split(" ");
        for (int i=0; i<sam.length; i++) {
            String word = sam[i];
            if(!wordCount.containsKey(word))
                wordCount.put(word, 1);
            else
                wordCount.put(word, wordCount.get(word) + 1);
        }

        // show results
        for(String word : wordCount.keySet())
            System.out.println(word + " " + wordCount.get(word));
        System.out.println(wordCount.size());
    }
}
