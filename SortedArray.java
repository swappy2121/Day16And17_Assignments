package com.Bridgelabz;
import java.util.Arrays;

public class SortedArray {

    public static void main(String[] args) {
        String words[] = new String[10];
        words[0] = "glad";
        words[1] = "happiness";
        words[2] = "beautifull";
        words[3] = "intelligent";
        words[4] = "clever";
        words[5] = "smart";
        words[6] = "incredible";
        words[7] = "longlasting";
        words[8] = "gorgeous";
        words[9] = "lovable";

        Arrays.sort(words);
        System.out.println( Arrays.toString(words));
    }
}