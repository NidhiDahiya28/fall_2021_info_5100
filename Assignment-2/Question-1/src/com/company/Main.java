package com.company;

public class Main {

    public static void main(String[] args) {
        Shape shape1 = new Shape("Shape 1", "Pink");
        shape1.printShape();
        System.out.println();

        Shape shape2 = new Shape("Shape 2", "Orange", 20, 30);
        shape2.printShape();
        System.out.println("The area is: " + shape2.getArea());
        System.out.println("The perimeter is: " + shape2.getPerimeter());
        System.out.println();

        Rectangle rectangle1 = new Rectangle(2);
        System.out.println("The shape is: Rectangle1");
        System.out.println("The area is: " + rectangle1.getArea());
        System.out.println("The perimeter is: " + rectangle1.getPerimeter());
        System.out.println();

        Rectangle rectangle2 = new Rectangle("Rectangle", "Purple", 4, 7);
        System.out.println("The shape is: Rectangle2");
        System.out.println("The area is: " + rectangle2.getArea());
        System.out.println("The perimeter is: " + rectangle2.getPerimeter());
        System.out.println(rectangle2.printShape());

        Squares square1 = new Squares(3);
        System.out.println("The shape is: Square1");
        System.out.println("The area is: " + square1.getArea());
        System.out.println("The perimeter is: " + square1.getPerimeter());
        System.out.println();

        Squares square2 = new Squares("Square", "Black", 7);
        System.out.println("The shape is: Square2");
        System.out.println("The area is: " + square2.getArea());
        System.out.println("The perimeter is: " + square2.getPerimeter());
        System.out.println(square2.printShape());


    }
}
