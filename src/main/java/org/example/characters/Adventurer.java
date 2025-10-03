package org.example.characters;

public class Adventurer extends Characters {

    int level = 1;
    int experience = 0;
    int experiencetolvl = 100;

    public Adventurer(String name, int maxHealth, int damage) {
        super(name, maxHealth, damage);
    }

    public void gainExperience(int amount) {
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
