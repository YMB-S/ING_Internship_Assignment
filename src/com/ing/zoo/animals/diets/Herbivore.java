package com.ing.zoo.animals.diets;

import com.ing.zoo.animals.Animal;

public abstract class Herbivore extends Animal {

    String eatLeavesText;

    public String getEatLeavesText() { return eatLeavesText; }

    public Herbivore(String name, String helloText, String eatLeavesText) {
        super(name, helloText);
        this.eatLeavesText = eatLeavesText;
    }

    public void eatLeaves(){
        System.out.println(eatLeavesText);
    }
}
