package org.example.characters;

public class Adventurer extends Characters {

    int level = 1;
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
            System.out.println(name + "Has fallen!!!!!");
        }

    }

    public void getexperience(int amount) {
        experience += amount;
        System.out.println(name + "Gained" + amount + "experience.");

        while (experience >= experiencetolvl) {
            experience -= experiencetolvl;
            level++;
            System.out.println(name + "Leveled up! Your new level is " + level);
            levelup();
        }
    }
    private void levelup() {
        health += 10;
        System.out.println(name + "You got" +health + "after leveling");
    }
}
