package com.company;

public class Squares extends Shape{
    public int side ;

    public Squares(int side){
        this.side  = side;

    }

    public Squares(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }



    @Override
    public int getArea(){
        return side*side;
    }


    @Override
    public int getPerimeter(){
        return 4*side;

    }


    }





