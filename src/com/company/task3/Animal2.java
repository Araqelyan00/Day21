package com.company.task3;

public class Animal2 {
    private int age;
    private String name;
    public Animal2(){
    }
    public Animal2(int age, String name){
        this.age = age;
        this. name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sound(){
        return "Sound";
    }

    @Override
    public String toString() {
        return "Animal's age: " + age + ", name: " + name + ", and makes this sound: " + sound();
    }
}
