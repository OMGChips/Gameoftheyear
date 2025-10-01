package org.example.characters;

public abstract class Characters {
    protected String name;
    protected int health;
    protected int damage;

    public Characters(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public boolean isalive() {
        return health > 0;
    }

    public abstract void takeDamage(int damage);


}