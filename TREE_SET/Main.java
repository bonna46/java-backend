package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {


    Set<String> pp= new TreeSet<>();
    //construct a TreeSet with a constructor that lets us define the order in which the elements
        // get sorted by using a Comparable or Comparator
       // Set<String> pp=new TreeSet<>(Comparator.comparing(String :: length));

        pp.add("I");
        //adds element only if element is not present in set
        pp.add("I");  /// [I]
        pp.add("Love");  /// [I, Love]
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
            System.out.println("Empty Treeset");
        else
            System.out.println("Not Empty Treeset");

        pp.add("I");
        pp.add("love");
        pp.add("tae");
        System.out.println(pp.size()); /// I love tae

        System.out.println("Iterator: ");
        Iterator<String> itr = pp.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        TreeSet<String> ss= new TreeSet<>();
        ss.add("First");
        if(ss.first()=="First") //if empty treeset then exception
            System.out.println("matched ");
        else
            System.out.println("not matched ");

        if(ss.last()=="First") //if empty treeset then exception
            System.out.println("matched ");
        else
            System.out.println("not matched ");

        TreeSet<Integer> xx= new TreeSet<>();
        xx.add(1);
        xx.add(2);
        xx.add(3);
        xx.add(40);
        xx.add(5);
        xx.add(6);
        ///1,2,3,5,6,40

        Set<Integer> yy= xx.subSet(2,6);
        System.out.println(yy);/// [2,3,5]

        yy=xx.headSet(6);
        System.out.println(yy);/// [1,2,3,5]

        yy=xx.tailSet(6);
        System.out.println(yy);/// [1,2,3,5]



    }
}

/*not working
 while(itr.hasNext()) {
            System.out.println(itr.next());
            pp.remove("Love"); ///throws exception if modify after initializing iterator
            itr.remove(); ///works with iterator
        }

        Iterator<String> des_itr =pp.descendingIterator();
        while(des_itr.hasNext())
            System.out.println(des_itr.next());
*/
