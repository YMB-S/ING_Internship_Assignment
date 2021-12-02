package com.ing.zoo.animals.diets;

import com.ing.zoo.animals.Animal;

public abstract class Omnivore extends Animal {
    String eatMeatText;
    String eatLeavesText;

    public Omnivore(String name, String helloText,
                    String eatMeatText, String eatLeavesText) {
        super(name, helloText);
        this.eatMeatText = eatMeatText;
        this.eatLeavesText = eatLeavesText;
    }

    public String getEatMeatText() { return eatMeatText; }
    public String getEatLeavesText() { return eatLeavesText; }

    public void eatMeat(){
        System.out.println(eatMeatText);
    }

    public void eatLeaves(){
        System.out.println(eatLeavesText);
    }
}