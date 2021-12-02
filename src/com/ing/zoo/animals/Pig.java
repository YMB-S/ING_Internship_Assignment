package com.ing.zoo.animals;

import com.ing.zoo.animals.actions.PerformsTrick;
import com.ing.zoo.animals.diets.Omnivore;

import java.util.Random;

public class Pig extends Omnivore implements PerformsTrick {

    public Pig(String name)
    {
        super(name, "Oink Oink!", "Oink. Swallow!", "Munch Munch Oink!");
    }

    public void performTrick()
    {
        Random random = new Random();
        String trick = "";

        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
