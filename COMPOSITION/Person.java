package com.company;

import java.util.Optional;

public class Person {
    private  String name;
    private  Integer age;
    private String seat;
    public Person(String name, Integer age,String seat){
        this.name=name;
        this.age=age;
        this.seat=seat;
    }
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
    public String getSeat() {
        return seat;
    }



}
