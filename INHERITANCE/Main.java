package com.company;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ///Inheritance; is-a relationship
        Engineer e1=new Engineer("Tae",26, "B.Sc");
        Engineer e2=new Engineer("rm",27, "M.Sc");
        System.out.println(e1.getPName() + " and "+ e2.getPName());
       ///Tae and rm

        Musician m1=new Musician("jin",30,Arrays.asList("tonight","Autumn in the post office"));
        System.out.println(m1.getMName() + "; his most popular song is "+ m1.getSongs().get(0));
        ///jin; his most popular song is tonight

    }
}