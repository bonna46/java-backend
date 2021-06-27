package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> pp = new ArrayList<>();
        pp.add("A");
        pp.add("B");
        pp.add("C");
        pp.add("D");
        pp.add(2, "E");
        System.out.println(pp);
        ///[A, B, E, C, D]

        pp.remove("B");
        pp.remove("v"); //not exist in list
        pp.remove(2);
        System.out.println(pp);
        ////[A, E, D]

        for(int i=0;i<pp.size();i++) {
            System.out.println(pp.get(i) + " ");
        }
        ///A
        //E
        //D

        pp.set(1, "Broklyn");
        for(String exam : pp)
        {
            System.out.println(exam + " ");
        }
        /// A
        /// Broklyn
        ///D
    }
}
