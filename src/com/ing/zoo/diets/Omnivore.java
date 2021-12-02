package com.ing.zoo.diets;

import com.ing.zoo.animals.Animal;

public abstract class Omnivore extends Animal {
    String eatMeatText;
    String eatLeavesText;

    public Omnivore(String name, String helloText) {
        super(name, helloText);
    }

    public String getEatMeatText() { return eatMeatText; }
    public String getEatLeavesText() { return eatLeavesText; }

    void eatMeat(){

    }

    void eatLeaves(){

    }
}