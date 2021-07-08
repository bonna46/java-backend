package com.company;


import java.io.IOException;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        Optional<String> emptyString=Optional.empty();
        if(emptyString.isPresent())
            System.out.println("items are present");
        else
            System.out.println("empty optional");
        ///empty optional

       // emptyString=Optional.of(null);///Exception in thread "main"

        emptyString=Optional.ofNullable(null);
        ///String s=emptyString.get();///exception
        ///System.out.println("get null "+ s);
        if(emptyString.isPresent())
            System.out.println("items are present");
        else
            System.out.println("empty optional");
        ///empty optional

        emptyString=Optional.of("sadia");
        String ss=emptyString.get();
        System.out.println("get "+ ss);
        if(emptyString.isPresent())
            System.out.println("items are present");
        else
            System.out.println("empty optional");
        ///items are present

        emptyString=Optional.ofNullable("Sadia");///u can insert null without exception
        if(emptyString.isPresent())
            System.out.println("items are present");
        else
            System.out.println("empty optional");
        ///items are present

        System.out.println();
        System.out.println("CHECK ISEMPTY::");
        if(emptyString.isEmpty())
            System.out.println("empty optional");
        else
            System.out.println("not empty");
        ///not empty

        emptyString.ifPresent(name -> System.out.println("ifPresent "+ name.length()));///ifPresent 5


       String name1= "sadia";
       String name= Optional.ofNullable(name1).orElse("bonna");
       System.out.println(name);///sadia

        String name2= null;
        String name3= Optional.ofNullable(name2).orElse("bonna");
        System.out.println(name3);///bonna

        System.out.println();
        System.out.println("CHECKING ORELSE::");
        String namee= null;
        String namee1= Optional.ofNullable(namee).orElse(getDefault());
        System.out.println(namee1);///Getting default value...
        ///kookie

        System.out.println();
        System.out.println("CHECKING ORELSEGET::");
        String namee2= null;
        String namee3= Optional.ofNullable(namee2).orElseGet(Main::getDefault);
        System.out.println(namee3);///Getting default value...
        ///kookie

        String nullName=null;
       /// String anotherString= Optional.ofNullable(nullName).orElseThrow();///Exception
        ///System.out.println(anotherString);

        Integer year = 2021;
        Optional<Integer> yearOptional = Optional.of(year);
        boolean is2021 = yearOptional.filter(y -> y == 2021).isPresent();
        System.out.println("is it 2021? "+ is2021);
        boolean is2020 = yearOptional.filter(y -> y == 2020).isPresent();
        System.out.println("is it 2020? "+ is2020);

    }
    public static String getDefault()
    {
        System.out.println("Getting default value...");
        return "kookie";
    }
}