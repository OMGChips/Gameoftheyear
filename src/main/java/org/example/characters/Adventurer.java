package org.example.characters;

public class Adventurer extends Characters {

    int levelup;
    int experience;
    int experiencetolvl = 100;

    public Adventurer(String name, int health, int damage) {
        super(name, 100, damage);
    }

    public void takeDamage(int damage) {
        System.out.println(getName() + "takes" + damage + "damage");
        health -= damage;
        if (isalive()) {
            System.out.println(name + "took damage! Health is now: " + health);
        } else {
            health = 0;
        }

    }

    public void experience() {
        System.out.println(name + "Gained a level, is now level" + level);

        while (experience >= experiencetolvl) {
            experiencetolvl -= experience;
            levelup++
        }
    }
}
