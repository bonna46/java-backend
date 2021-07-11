package com.company;

import java.util.Optional;

public class Person {
    private  String name;
    private  Integer age;
    public Person(String name, Integer age){
        this.name=name;
        this.age=age;
    }
    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }



}
