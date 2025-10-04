package org.example.characters;

public class Adventurer extends Characters {


    private Weapon weapon;

    @Override
    public void specialAbility() {
    }

    protected int level = 1;
    protected int experience = 0;
    protected int experiencetolvl = 100;


    public int getExperience() {
        return experience;
    }

    public int getLevel() {
        return level;
    }

    public Adventurer(String name, int maxHealth, int damage) {
        super(name, maxHealth, damage);
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public int attack(){
        int baseDamage = super.attack();
        if (weapon != null) {
            baseDamage += weapon.getBonusDamage();
        }
        return baseDamage;
    }

    public void gainExperience(int amount) {
        experience += amount;
        System.out.println("\u001B[32m" + name + "\u001B[0m" + " Gained: " + "\u001B[33m" + amount + " experience." + "\u001B[0m");

        while (experience >= experiencetolvl) {
            experience -= experiencetolvl;
            level++;
            System.out.println("\u001B[32m" + name + "\u001B[0m" + " Leveled up! You are now lvl: " + "\u001B[36m" + level + "\u001B[0m");
            levelup();
            health = maxHealth;
            System.out.println("Health restored to " + "\u001B[31m" + maxHealth + "\u001B[0m" + " after leveling");
        }
    }

    private void levelup() {
        maxHealth += 15;
        System.out.println("\u001B[32m" + name + "\u001B[0m" + " Your new max health after leveling is: " + "\u001B[31m" + maxHealth + "\u001B[0m");
    }

    public void heal(int amount) {
        health += amount;
        if (health > maxHealth) {
            System.out.println("\u001B[32m" + name + "\u001B[0m" + " healed and health is now " + "\u001B[31m" + health + "\u001B[0m");
        }
    }
}