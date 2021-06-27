package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> pp= new LinkedList<>();
        pp.add("A");
        pp.add("B");
        System.out.println(pp);
        ///[A, B]
        pp.addFirst("C");
        pp.addLast("D");
        pp.add(2,"E");
        System.out.println(pp);
        ///[C, A, E, B, D]
        pp.push("L");
        System.out.println(pp);
        ///[L, C, A, E, B, D]

        pp.remove("B");
        pp.remove("v"); //not exist in list
        pp.remove(2);
        pp.removeFirst();
        pp.removeLast();
        pp.removeLast();
        System.out.println(pp);
        ///[C]


        pp.poll(); //returns null on empty list
        System.out.println(pp);
        ///[]
        pp.pop(); //returns exception on empty list
        System.out.println(pp);
        ///Exception
    }
}
