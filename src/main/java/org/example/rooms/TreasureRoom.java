package org.example.rooms;

import org.example.characters.Adventurer;
import org.example.characters.Monsters;

import java.util.Random;
import org.example.Art;

public class TreasureRoom extends Room {
    public Monsters enter(Adventurer adventurer) {

        System.out.println("You walk into a beautiful room where you look around and find: ");
        int random = new Random().nextInt(100);

        if (random < 30) {
            int hp = 20;
            // Fix so the hp doesn't go over max
            System.out.println(Art.flask + "You found a healing potion and restored " + hp + " health");
            adventurer.heal(hp);
            System.out.println("---------------------");
        } else {
            int xp = 55;
            System.out.println(Art.treasure +"You found a chest filled with XP and gained " + "\u001B[33m" + xp + "\u001B[0m" +" experience"
            );

            adventurer.gainExperience(xp);
            System.out.println("---------------------");
        }
return null;
    }

}
