package org.example.rooms;

import org.example.characters.Adventurer;
import org.example.characters.Monsters;

public class TrapRoom extends Room {

    public Monsters enter(Adventurer adventurer) {

        int damage = 15;
        System.out.println("You walked into a room and triggered a trap damaging you for: " + "\u001B[31m" + damage + "\u001B[0m");
        adventurer.takeDamage(damage);
        System.out.println("----------------");
        return null;
    }
}
