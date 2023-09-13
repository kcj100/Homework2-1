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
        Animal dog = new Animal("Dog", "Rocky", new String[]{"woof!", "roof!"});
        Animal cat = new Animal("Cat", "Misty", new String[]{"meow!", "purr..."});
        Animal horse = new Animal("Horse", "Thunder", new String[]{"neigh!", "pfff!"});
        
        dog.printDescription();
        dog.printAnimalSound();
        System.out.println("");
        
        cat.printDescription();
        cat.printAnimalSound();
        System.out.println("");
        
        horse.printDescription();
        horse.printAnimalSound();
    }
}
