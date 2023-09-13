
package com.kcj.aniproject;

import java.util.Arrays;

public class Animal {
    private String animalType;
    private String name;
    private String[] sounds;
    
    public Animal() {
        
    }

    public Animal(String animalType, String name, String[] sounds) {
        this.animalType = animalType;
        this.name = name;
        this.sounds = sounds;
    }
    
    public void printAnimalSound() {
        System.out.println("Sounds: ");
        Arrays.stream(sounds)
                .forEach(i -> System.out.println(i));
    }

    public void printDescription() {
        System.out.println("Name: " + this.name + ", Animal Type: " + this.animalType);
    }
    
}
