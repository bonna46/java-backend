package com.company;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Customer tae=new Customer("Tae",150);
        Customer kookie=new Customer("Kookie",50);
        Customer suga= new Customer("Suga",800);
        Customer joonie=new Customer("joonie",40);
        Customer hobi=new Customer("Hobi",200);
        Customer mochi=new Customer("Mochi",15);
        Customer jin=new Customer("Jin",650);
        List<Customer> pp= Arrays.asList(tae,kookie,suga,joonie,hobi,mochi,jin);
        ///with method reference
        List<Customer> p1= pp.stream().filter(Customer::comparePrice).collect(Collectors.toList());
        System.out.println("more than 100 tk: ");
        p1.forEach(element-> System.out.println(element.getName()));
        ///Tae
        //Suga
        //Hobi
        //Jin


        ///with lambda expression
        List<Customer> p2= pp.stream().filter(c -> c.getPrice() < 100).collect(Collectors.toList());
        System.out.println("less than 100 tk: ");
        p2.forEach(element-> System.out.println(element.getName()));
        ///Kookie
        //joonie
        //Mochi
    }
}