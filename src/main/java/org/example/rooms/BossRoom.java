package org.example.rooms;

import org.example.characters.Adventurer;
import org.example.characters.Monsters;

public class BossRoom extends Room {
    public Monsters enter(Adventurer adventurer) {
        System.out.println("You chose to fight the beast!");
        return null;
    }
}
