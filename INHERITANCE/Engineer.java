package com.company;

public class Engineer extends Person{
    private String degree;

    public Engineer(String name, Integer age,String degree) {
        super(name,age);
        this.degree=degree;
    }

    public String getDegree(){
        return degree;
    }
    public String getPName(){
        return getName();
    }

}
