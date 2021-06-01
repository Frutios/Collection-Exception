package com.formation.collection;

public class DivisionByZeroException extends Exception {

    public void divisionByZero() {
        System.err.println("Division par 0 impossible");
    }
}
