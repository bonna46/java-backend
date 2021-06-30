package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {


    Set<String> pp= new HashSet<>();

        pp.add("I");
        //adds element only if element is not present in set
        pp.add("I");  /// [I]
        pp.add("Love");  /// [Love, I]
        System.out.println(pp);

        if(pp.contains("Love"))
            System.out.println("Contains love");
        else
            System.out.println("No love");

        pp.remove("Hate");
        pp.remove("Love");
        System.out.println(pp); /// [I]

        pp.clear();

        if(pp.isEmpty())
            System.out.println("Empty Hashset");
        else
            System.out.println("Not Empty Hashset");

        pp.add("I");
        pp.add("love");
        pp.add("tae");
        System.out.println(pp.size()); /// I love tae

        System.out.println("Iterator: ");
        Iterator<String> itr = pp.iterator();
        while(itr.hasNext()) {
            String str= itr.next();
            System.out.println(str);
            if(str.equals("love") )
            itr.remove();
        }
         System.out.println(pp); ///[I, tae]

    }
}

