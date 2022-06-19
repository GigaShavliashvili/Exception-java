package com.company;

public class FractionException extends Exception{

    public FractionException(String s, int numerator, int denominator) {
        System.out.println(s  +  numerator + denominator);
    }
}
