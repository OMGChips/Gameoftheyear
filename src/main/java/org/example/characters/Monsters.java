package org.example.characters;

public abstract class Monsters extends Characters {
    public Monsters(String name, int maxHealth, int damage) {
        super(name, maxHealth, damage);
    }
    @Override
    public void specialAbility() {
    }
}
