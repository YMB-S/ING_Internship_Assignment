package com.ing.zoo.animals;

public abstract class Animal {
    String name;
    String helloText;

    public String getName() { return name; }
    public String getHelloText() { return helloText; }

    public Animal(String name, String helloText){
        this.name = name;
        this.helloText = helloText;
    }

    public void sayHello()
    {
        System.out.println(getHelloText());
    }
}
