package com.company;


import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        ///Composition: PlaneTicket has 3 Persons(has a relationship)
        Person p1=new Person("Tae",26, "B1");
        Person p2=new Person("kookie",23, "C1");
        Person p3=new Person("Mochi",26, "B2");
        PlaneTicket FlyToKorea= new PlaneTicket(22,Arrays.asList(p1,p2,p3));
        for(Person pp: FlyToKorea.getAllPassenger())
        {
            System.out.println("name: " + pp.getName() + ", seatNumber: " + pp.getSeat());
        }
        //name: Tae, seatNumber: B1
        //name: kookie, seatNumber: C1
        //name: Mochi, seatNumber: B2
    }
}