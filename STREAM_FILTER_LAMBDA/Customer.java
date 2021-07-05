package com.company;

public class Customer {
    private String Name;
    private Integer Price;
    public Customer(String name, Integer price)
    {
        this.Name=name;
        this.Price=price;
    }
    public boolean comparePrice()
    {
        return this.Price > 100;
    }
    public String getName(){
        return this.Name;
    }
    public Integer getPrice(){
        return this.Price;
    }
    public void setName(String name){
        this.Name=name;
    }
    public void setPrice(Integer price){
        this.Price=price;
    }


}
