package com.ing.zoo.animals.diets;

import com.ing.zoo.animals.Animal;

public abstract class Carnivore extends Animal {

    String eatMeatText;

    public String getEatMeatText() { return eatMeatText; }

    public Carnivore(String name, String helloText, String eatMeatText) {
        super(name, helloText);
        this.eatMeatText = eatMeatText;
    }

    public void eatMeat(){
        System.out.println(eatMeatText);
    }
}
