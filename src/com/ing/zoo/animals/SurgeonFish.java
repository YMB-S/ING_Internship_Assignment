package com.ing.zoo.animals;

import com.ing.zoo.animals.actions.PerformsTrick;
import com.ing.zoo.animals.diets.Herbivore;

public class SurgeonFish extends Herbivore implements PerformsTrick {

    public SurgeonFish(String name){
        super(name, "Hi, I'm a fish! Blub.", "Hmmm.. Algae...");
    }

    public void performTrick(){
        System.out.println("I can spin in a circle! *spins*");
    }
}
