package com.company.task3;

public class Cat extends Animal2{

    public Cat(){

    }

    public Cat(int age, String name){
        super(age, name);
    }
    @Override
    public String sound(){
        return "Cat's sound";
    }

    @Override
    public String toString() {
        return "Cat's age: " + super.getAge() + ", name: " + super.getName() + ", and makes this sound: " + sound();
    }
}
