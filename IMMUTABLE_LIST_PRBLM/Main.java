package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ///prblm With Guava and Apache...dont know how to run
        List<String> pp = new ArrayList<>(Arrays. asList("I","love","taetae"));
        List<String> unmodifiedList = ListUtils.unmodifiableList(pp);
        System.out.println(unmodifiedList);
        unmodifiedList.add("somuch");
        System.out.println(unmodifiedList);
        ///Exception


    }
}

/*
  ///With the JDK
        List<String> list = new ArrayList<>(Arrays. asList("I","love","taetae"));
        List<String> unmodifiedList = Collections.unmodifiableList(list);
        System.out.println(unmodifiedList);
        unmodifiedList.add("somuch");
        System.out.println(unmodifiedList);
        ///Exception

 ///With Java 9
        final List<String> pp = new ArrayList<>(Arrays. asList("I","love","taetae"));
        final List<String> unmodifiedList =List.of(pp.toArray(new String[]{}));
        System.out.println(unmodifiedList);
        unmodifiedList.add("somuch");
        System.out.println(unmodifiedList);
        ///Exception

 */