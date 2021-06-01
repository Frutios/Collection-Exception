package com.formation.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    private static boolean resultOk;

    public static void main(String[] args){

        ArrayList<Country> countries = new ArrayList<>();

        Country france = new Country("France");
        Country spain = new Country("Spain");
        Country portugal = new Country("Portugal");
        Country belgique = new Country("Belgique");
        countries.add(france);
        countries.add(spain);
        int size = countries.size();
        System.out.println("La collection contient " + size + " pays !");

        for (int i = 0; i < countries.size(); i++) {
            Country country = countries.get(i);
            System.out.println(country.getName());
        }

        countries.clear();

        try {
            displayCountries(countries);
        } catch (ListEmptyException e) {
            e.emptyList();
        }

        countries.add(france);
        countries.add(spain);
        countries.add(portugal);
        countries.add(belgique);
        //countries.set(0, spain);

        //Collections.sort(countries); // Avec comparable
        Collections.sort(countries, new CountryComparator()); // Avec comparator
        //countries.sort(new CountryComparator()); Sans l'appel à la collection

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("a ?");
            int a = scanner.nextInt();
            System.out.println("b ?");
            int b = scanner.nextInt();
            try {
                float result = division(a, b);
                System.out.println("Resultat de la division = " + result);
                resultOk = true;
            } catch (DivisionByZeroException e) {
                e.divisionByZero();

            }
        } while (!resultOk);
        scanner.close();

    }

    public static void displayCountries(ArrayList<Country> countries) throws ListEmptyException {
        for (int i = 0; i < countries.size(); i++) {
            Country country = countries.get(i);
            System.out.println(country.getName());
        }

        if (countries.size() == 0) {
            throw new ListEmptyException();
        }
    }

    public static float division(int a, int b) throws DivisionByZeroException {
        if (b == 0){
            throw new DivisionByZeroException();
        }

        return a / b;
    }

}
