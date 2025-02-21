package com.example.classandobjects_10_1kt_24_xushnazarov;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    public String getIntroduction() {
        return "My name is " + name + " and I am " + age + " years old.";
    }
}
