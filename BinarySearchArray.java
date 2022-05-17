package com.Bridgelabz;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchArray {
    public static String words[] = new String[10];

        public static void main (String[]args) {

            words[0] = "bike";
            words[1] = "cars";
            words[2] = "aeroplane";
            words[3] = "motorcycle";
            words[4] = "cycle";
            words[5] = "boat";
            words[6] = "ship";
            words[7] = "rocket";
            words[8] = "submarine";
            words[9] = "racing bike";


            Scanner sc = new Scanner(System.in);
            System.out.println("enter your input : ");
            String charKey = sc.next();
            Arrays.sort(words);
            System.out.println(charKey + " found at index = " + Arrays.binarySearch(words, charKey));
            System.out.println(Arrays.toString(words));
        }
    }

