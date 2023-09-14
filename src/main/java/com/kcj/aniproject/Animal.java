package com.kcj.aniproject;

import java.util.Arrays;

public class Animal {

    // StringBuilder is a different data type than String
    private StringBuilder animalType;
    private String name;
    // String[] is a different data type than String
    private String[] sounds;

    public Animal() {

    }

    public Animal(StringBuilder animalType, String name, String[] sounds) {
        this.animalType = new StringBuilder(animalType);
        this.name = name;
        this.sounds = sounds;
    }

    public void printAnimalSound() {
        System.out.println(sounds[0]);
    }

    public void printAllAnimalSounds() {
        System.out.println("Sounds: ");
        Arrays.stream(sounds)
                .forEach(i -> System.out.println(i));
    }

    public void printDescriptions() {
        System.out.println("Name: " + this.name + ", Animal Type: " + animalType);
    }

}
