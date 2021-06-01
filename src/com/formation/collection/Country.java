package com.formation.collection;

public class Country implements Comparable<Country> {

    private String name;

    public Country(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Country c){
        return this.getName().compareTo(c.getName());
    }
}
