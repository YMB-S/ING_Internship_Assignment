package com.ing.zoo;

import com.ing.zoo.animals.Animal;
import com.ing.zoo.animals.*;
import com.ing.zoo.animals.actions.PerformsTrick;
import com.ing.zoo.animals.diets.Carnivore;
import com.ing.zoo.animals.diets.Herbivore;
import com.ing.zoo.animals.diets.Omnivore;

import java.util.LinkedList;
import java.util.Scanner;

public class Zoo {

    LinkedList<Animal> animals;

    public Zoo(LinkedList<Animal> animals){
        this.animals = animals;
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo(createAnimals());
        zoo.runZoo();
    }

    static LinkedList<Animal> createAnimals(){

        LinkedList<Animal> animals = new LinkedList<>();

        animals.push(new Lion("Henk"));
        animals.push(new Hippo("Elsa"));
        animals.push(new Pig("Dora"));
        animals.push(new Tiger("Wally"));
        animals.push(new Zebra("Marty"));

        return animals;
    }

    void runZoo(){
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Voer uw command in: ");
            String input = scanner.nextLine().toLowerCase();

            String[] commandsGiven = input.split("\\s+");

            String whatToDo = commandsGiven[0];
            String thingToDo = commandsGiven.length > 1 ? commandsGiven[1] : null;

            switch(whatToDo){

                case "hello":
                    sayHello(thingToDo);
                    break;

                case "give":
                    give(thingToDo);
                    break;

                case "perform":
                    performTrick();
                    break;
            }
        }
    }

    void performTrick(){

        // Check all Animals for implementation of the PerformsTrick interface and make them do their trick
        for(Animal animal : animals){
            if(animal instanceof PerformsTrick){
                ((PerformsTrick) animal).performTrick();
            }
        }
    }

    void sayHello(String animalName){

        // If no animalName is specified, all animals say hello
        if(animalName == null){
            for(Animal animal : animals){
                animal.sayHello();
            }
        }

        // Otherwise only the specified animal says hello
        else{
            for(Animal animal : animals){
                if(animal.getName().toLowerCase().equals(animalName)){
                    animal.sayHello();
                }
            }
        }
    }

    void give(String typeOfFood){
        System.out.println(typeOfFood);
        switch(typeOfFood){
            case "leaves":
                // Make all Herbivores eat leaves
                for(Animal herbivore : animals){
                    if (herbivore instanceof Herbivore){
                        ((Herbivore) herbivore).eatLeaves();
                    }
                    if (herbivore instanceof Omnivore){
                        ((Omnivore) herbivore).eatLeaves();
                    }
                }
                break;

            case "meat":
                // Make all Carnivores eat meat
                for(Animal carnivore : animals){
                    if (carnivore instanceof Carnivore){
                        ((Carnivore) carnivore).eatMeat();
                    }
                    if (carnivore instanceof Omnivore){
                        ((Omnivore) carnivore).eatMeat();
                    }
                }
                break;

            default:
                System.out.println("Food non existent!");
        }
    }
}
