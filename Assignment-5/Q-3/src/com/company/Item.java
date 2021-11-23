package com.company;

public class Item extends ShoppingCart{
    String ID;
    int price;

    public Item(String ID, int price){
        this.ID = ID;
        this.price = price;
    }

    public String getID(){
        return ID;
    }

    public int getPrice(){
        return price;
    }
}
