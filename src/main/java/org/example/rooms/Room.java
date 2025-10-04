package org.example.rooms;

import org.example.characters.Adventurer;
import org.example.characters.Monsters;

public abstract class Room {
    public abstract Monsters enter(Adventurer adventurer);
}
