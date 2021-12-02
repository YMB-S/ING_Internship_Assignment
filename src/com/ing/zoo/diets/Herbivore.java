package com.ing.zoo.diets;

import com.ing.zoo.animals.Animal;

public abstract class Herbivore extends Animal {

    String eatLeavesText;

    public String getEatLeavesText() { return eatLeavesText; }

    public Herbivore(String name, String helloText) {
        super(name, helloText);
    }

    public void eatLeaves(){
        System.out.println(eatLeavesText);
    }
}
