package com.company;

public class CreditCard implements PaymentStrategy{
    String cardNumber;

    CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public void pay(int payment){
        System.out.println("Credit Card: $" + payment);
    }
}
