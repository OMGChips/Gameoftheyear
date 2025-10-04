package org.example.rooms;

import org.example.characters.Adventurer;
import org.example.characters.Monsters;

public class EmptyRoom extends Room {
    public Monsters enter(Adventurer adventurer) {
        System.out.println("You walk into a quit place with nothing in it");
        System.out.println("---------------------");
    return null;
    }
}
