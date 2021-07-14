package com.company;

import java.util.ArrayList;
import java.util.List;

public class PlaneTicket {
    private Integer departureDate;
    List<Person> personList= new ArrayList<>();

    public PlaneTicket(Integer date, List<Person> pp){
        this.departureDate=date;
        this.personList=pp;
    }

    public Integer getDepartureDate() {
        return departureDate;
    }

    public List<Person> getAllPassenger() {
        return personList;
    }
}
