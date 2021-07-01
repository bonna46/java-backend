package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    Map<String, String> pp = new HashMap<>();

    ///insert in hashmap
    pp.put("first","bike");
    pp.put("second","bus");
    pp.put("third","bus");
    pp.put("fourth","air");
    System.out.println(pp); ///{third=bus, fourth=air, first=bike, second=bus}
    System.out.println(pp.get("second")); ///bus
        System.out.println(pp.values()); ///[bus, air, bike, bus]
        System.out.println(pp.keySet()); ///[third, fourth, first, second]

        for(Map.Entry<String,String> entry:  pp.entrySet())
        {
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+ " = "+value);
        }
        ///third = bus
        //fourth = air
        //first = bike
        //second = bus

        for(String key : pp.keySet()) {
            String val = pp.get(key);
            System.out.println("value is " + val);
        }
        //value is bus
        //value is air
        //value is bike
        //value is bus

        pp.forEach( (key,value) -> {
            System.out.println(key + " and its value is " + value);
        });
        //third and its value is bus
        //fourth and its value is air
        //first and its value is bike
        //second and its value is bus

        if(pp.containsKey("fourth"))
            System.out.println("4th key exists");
        else
            System.out.println("4th key doesn't exists");
        //4th key exists

        if(pp.containsValue("bike"))
            System.out.println("4th value exists");
        else
            System.out.println("4th value doesn't exists");
        //4th value exists

        pp.remove("first");
        System.out.println(pp); ///{third=bus, fourth=air, second=bus}

    }
}

