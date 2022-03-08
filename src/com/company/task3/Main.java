package com.company.task3;

public class Main {
    public static void main(String[] args) {
        Animal2 animal2 = new Animal2(3, "Animal's name");
        System.out.println(animal2);

        Animal2 cat1 = new Cat(2,"First cat");
        System.out.println(cat1);

        Cat cat2 = new Cat(4, "Second cat");
        System.out.println(cat2);
    }
}
