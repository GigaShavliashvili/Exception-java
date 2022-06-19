package com.company;

public class Fraction  {

    private int numerator;
    private  int denominator;

    public void getFraction(int numerator, int denominator) throws Exception{
        if(numerator == 0){
            throw  new FractionException("numinator is 0", numerator, denominator);
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
}
