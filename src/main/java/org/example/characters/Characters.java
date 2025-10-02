package org.example.characters;

import java.util.Random;

public abstract class Characters {
    protected String name;
    protected int health;
    protected int damage;
    protected int maxHealth;

    public Characters(String name, int maxHealth, int damage) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public abstract void takeDamage(int damage);

    public int attack() {
        int min = (int) (damage * 0.6);
        int max = (int) (damage * 1.4);
        return new Random().nextInt( max - min + 1 ) + min;
    }

}