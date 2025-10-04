package org.example.rooms;

import org.example.characters.Adventurer;
import org.example.characters.Monsters;
import org.example.characters.Monstertypes;

import java.util.Random;

public class MonsterRoom extends Room {


    private static String[] monsterTypes = {"mummy", "zombie", "scarab", "skeleton"};

    public Monsters enter(Adventurer adventurer) {

        String monsterPick = monsterTypes[new Random().nextInt(monsterTypes.length)];
        Monsters monster = new Monstertypes(monsterPick);
        System.out.println("You walk into a room with a fierce monster " + "\u001B[32m" + monster.getName() + "\u001B[0m");
        return monster;
    }
}
