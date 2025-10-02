package org.example.characters;

public class Adventurer extends Characters {

    int level = 1;
    int experience = 0;
    int experiencetolvl = 100;

    public Adventurer(String name, int maxHealth, int damage) {
        super(name, maxHealth, damage);
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println(getName() + " takes " + damage + " damage");
        health -= damage;
        if (isAlive()) {
            System.out.println(name + " took damage! Health is now: " + health);
        } else {
            health = 0;
            System.out.println(name + " Has fallen!!!!!");
        }
    }

    public void gainexperience(int amount) {
        experience += amount;
        System.out.println(name + " Gained: " + amount + " experience.");

        while (experience >= experiencetolvl) {
            experience -= experiencetolvl;
            level++;
            System.out.println(name + " Leveled up! Your new level is " + level);
            levelup();
            health = maxHealth;
            System.out.println("Health restored to " + maxHealth + " after leveling");
        }
    }

    private void levelup() {
        maxHealth += 15;
        System.out.println(name + " Your new max health after leveling is: " + maxHealth);
    }
}
