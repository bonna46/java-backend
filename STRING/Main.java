package com.company;


import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        String s1 = "Hello world";
        String s2 = "Hello world";
        String s3 = "HELLO WORLD";
        StringBuffer sb = new StringBuffer("HELLO WORLD");
        if (s1.equals(s2)) {
            System.out.println("String matches!");
        }
        if (s1.contentEquals(sb)) {
            System.out.println("s1 Stringbuffer matches!");
        }

        if (s3.contentEquals(sb)) {
            System.out.println("s3 Stringbuffer matches!");
        }
        if(s1.contains("world")) {
            System.out.println("world is contained!");
        }
            
    }
}