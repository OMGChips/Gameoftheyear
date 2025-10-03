package org.example.characters;

public class Monsters extends Characters {
    public Monsters(String name, int maxHealth, int damage) {
        super(name, maxHealth, damage);
    }

    public Monsters(String monsterType) {
        super("unknown", 50, 5);


        switch (monsterType.toLowerCase()) {
            case "badguy1":
                this.name = "Badguy1";
                this.maxHealth = 45;
                this.damage = 10;
                break;
            case "mummy":
                this.name = "Mummy";
                this.maxHealth = 80;
                this.damage = 5;
                break;
            case "badguy2":
                this.name = "Badguy2";
                this.maxHealth = 15;
                this.damage = 28;
                break;
            case "badguy3":
                this.name = "Badguy2";
                this.maxHealth = 45;
                this.damage = 14;
                break;
            default:
                System.out.println("That wont work bro");
        }
    }
}
