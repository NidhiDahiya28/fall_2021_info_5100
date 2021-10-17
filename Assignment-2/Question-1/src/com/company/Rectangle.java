package com.company;

public class Rectangle extends Shape {
    public int width;
    public int height;


    public Rectangle(int side){
        this.height = side;
        this.width = side;
    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;

    }

    public Rectangle(String name, String color, int width, int height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea(){
        return height*width;
    }


    @Override
    public int getPerimeter(){
        return 2*(height + width);


    }


}




