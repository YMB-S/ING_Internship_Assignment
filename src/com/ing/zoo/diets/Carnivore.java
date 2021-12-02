package com.ing.zoo.diets;

import com.ing.zoo.animals.Animal;

public abstract class Carnivore extends Animal {

    String eatMeatText;

    public String getEatMeatText() { return eatMeatText; }

    public Carnivore(String name, String helloText) {
        super(name, helloText);
    }

    void eatMeat(){
        System.out.println(eatMeatText);
    }
}
