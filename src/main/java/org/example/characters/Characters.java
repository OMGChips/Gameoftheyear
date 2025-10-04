package org.example.characters;

import java.util.Random;

public abstract class Characters {

    public abstract void specialAbility();

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

public int getMaxHealth(){
        return maxHealth;
}
public int getDamage(){
        return damage;
}

    public void takeDamage(int damage) {
        health -= damage;
        if (isAlive()) {
            System.out.println("\u001B[32m" + name + "\u001B[0m" + " took damage! Health is now: " + "\u001B[31m" + health + "\u001B[0m");
        } else {
            health = 0;
            System.out.println("\u001B[32m" + name + "\u001B[0m" + " Has fallen!!!!!");
        }
    }
public void attack(Characters target) {
        int damageDealt = attack();
    System.out.println("\u001B[32m" + name + "\u001B[0m" + " attacks " + "\u001B[32m" +  target.getName() + "\u001B[0m" +" for " + "\u001B[31m" + damageDealt + "\u001B[0m" + " damage!!!");
    target.takeDamage(damageDealt);
    System.out.println("--------------------");
}


    public int attack() {
        int min = (int) (damage * 0.6);
        int max = (int) (damage * 1.4);
        return new Random().nextInt( max - min + 1 ) + min;
    }
}