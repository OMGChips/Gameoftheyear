package org.example.characters;

import org.example.utils.Helper;

public class Boss extends Monsters {

    private Helper helper;

    public Boss(String name, int maxHealth, int damage) {
        super(name, maxHealth, damage);
    }

    public Boss() {
        super("Anubis Guardian", 130, 34);
    }


    public void specialAbility(Characters target) {
        Helper helper = new Helper();
        if (helper.randomInt(0, 99) < 30) {
            System.out.println("\u001B[32m" + getName() + "\u001B[0m" + " Claws twice for a double damage!");
            int doubleDamage = damage * 2;
            System.out.println("\u001B[32m" + getName() + "\u001B[0m" + " deals " + "\u001B[31m" + doubleDamage + "\u001B[0m" + " damage");
            target.takeDamage(doubleDamage);
        } else {
            System.out.println("\u001B[32m" + getName() + "\u001B[0m" + " Failed to use double strike");
            System.out.println("---------------------");
        }
    }
}
