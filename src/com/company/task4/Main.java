package com.company.task4;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(10);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 5);
        Shape[] shapes = {square, circle, rectangle};
        for (Shape shape : shapes) {
            System.out.println(shape + "\n");
        }
    }
}
