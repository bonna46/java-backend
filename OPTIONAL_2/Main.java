package com.company;


import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        boolean b1=getPriceInRange(new Modem(13));
        boolean b2=getPriceInRange(new Modem(5));
        boolean b3=getPriceInRange(new Modem(505));
        boolean b4=getPriceInRange(null);

        System.out.println(b1);///true
        System.out.println(b2);///false
        System.out.println(b3);///false
        System.out.println(b4);///false


        Optional<List<String> > optList=Optional.ofNullable(Arrays.asList("tae","mochi","suga","kookie"));
        Integer size=optList
                .map(List::size)
                .orElse(0);
        System.out.println("Array size "+ size);

        Optional<String> optList1=Optional.ofNullable(" taetae ");
        boolean pp=optList1
                .map(String::trim)
                .filter(p -> p.equals("taetae"))
                .isPresent();
        System.out.println(pp);///true


        Person p1=new Person("tae",26);
        Optional<Person> optPerson= Optional.ofNullable(p1);
        boolean bAge=optPerson
               .flatMap(Person::getAge)
               .filter(p -> p >20)
               .isPresent();
        System.out.println(bAge);///true

    }

    public static boolean getPriceInRange(Modem modem1){
        return Optional.ofNullable(modem1).
                map(Modem::getPrice)
                .filter(p -> p > 10)
                .filter(p -> p<500)
                .isPresent();

    }
}