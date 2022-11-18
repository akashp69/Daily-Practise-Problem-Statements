package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class Day1Anagram {
    public static void main(String[] args) {
        String a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First word for Checking Anagram");
        a=sc.next();
        System.out.println("Enter Second word for Checking Anagram");
        b=sc.next();

        char firstword[]  = a.toCharArray();
        System.out.println(firstword.length);
        char secondword[] = b.toCharArray();

        Arrays.sort(firstword);
        Arrays.sort(secondword);

        for(int i=0;i<firstword.length;i++)
        {
            if (firstword[i]== secondword[i] && firstword.length == secondword.length){
                System.out.println("Given Word is Anagram");
            }
            else {
                System.out.println("Given Word is Not Anagram");
            }
            }

        }

    }

