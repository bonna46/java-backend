package com.company;

import java.util.List;

public class Musician extends Person{
    private List<String> songs;
    public Musician(String name, Integer age, List<String> songs) {
        super(name,age);
        this.songs=songs;
    }
    public List<String> getSongs(){
        return songs;
    }
    public String getMName(){
        return getName();
    }
}
