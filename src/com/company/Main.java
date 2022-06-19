package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

Fraction f1 = new Fraction();
f1.getFraction(0,33);
        System.out.println(f1.getDenominator() + f1.getNumerator());

       try{
           Deposit(0);
       }catch(ArithmeticException | NullPointerException exception){
           System.out.println(exception.getMessage());
       }
    }

    private static void Deposit(int amount) throws ArithmeticException, NullPointerException{
        if(amount < 0){
            throw new ArithmeticException("amount is lass then 20");
        }else if(amount == 0){
            throw  new NullPointerException("amount is equal to 20");
        }else{
            System.out.println("successfull");
        }
    }
}


