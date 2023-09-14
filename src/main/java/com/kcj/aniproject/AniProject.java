/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.kcj.aniproject;

/**
 *
 * @author kcj
 */
public class AniProject {

    public static void main(String[] args) {
        Animal dog = new Animal(new StringBuilder("Dog"), "Rocky", new String[]{"woof!", "roof!", "grrr!"});
        Animal cat = new Animal(new StringBuilder("Cat"), "Misty", new String[]{"meow!", "purr...", "hissss!"});
        Animal horse = new Animal(new StringBuilder("Horse"), "Thunder", new String[]{"neigh!", "pfff!", "brrr!"});

        dog.printAnimalSound();
        System.out.println("");

        cat.printAnimalSound();
        System.out.println("");

        horse.printAnimalSound();
        System.out.println("");

        System.out.println("I like those sounds that the animals make. Can they make more?");
        System.out.println("\nYes, indeed they can. Here are some more:\n");
        dog.printDescriptions();
        dog.printAllAnimalSounds();
        System.out.println("");
        cat.printDescriptions();
        cat.printAllAnimalSounds();
        System.out.println("");
        horse.printDescriptions();
        horse.printAllAnimalSounds();

    }
}
