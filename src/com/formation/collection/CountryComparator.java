package com.formation.collection;

import java.util.Comparator;

public class CountryComparator implements Comparator<Country> {
    @Override
    public int compare(Country country1, Country country2) {
        return country1.getName().compareTo(country2.getName());
    }
}
