package com.ing.zoo.animals;

import com.ing.zoo.animals.actions.PerformsTrick;
import com.ing.zoo.animals.diets.Carnivore;

import java.util.Random;

public class Tiger extends Carnivore implements PerformsTrick {

    public Tiger(String name)
    {
        super(name, "Large Meow...", "Grrr... Chomp!");
    }

    public void performTrick()
    {
        Random random = new Random();
        String trick = "";

        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
