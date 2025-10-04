package org.example.characters;

public class Monstertypes extends Monsters {
    public Monstertypes(String monsterType) {
        super("Unknown", 50, 5);

        switch (monsterType.toLowerCase()) {
            case "zombie":
                this.name = "Zombie";
                this.maxHealth = 45;
                this.damage = 10;
                break;
            case "mummy":
                this.name = "Mummy";
                this.maxHealth = 80;
                this.damage = 5;
                break;
            case "scarab":
                this.name = "Scarab";
                this.maxHealth = 15;
                this.damage = 28;
                break;
            case "skeleton":
                this.name = "Skeleton";
                this.maxHealth = 45;
                this.damage = 14;
                break;
            default:
                System.out.println("That wont work bro");
        }
    }

    @Override
    public void specialAbility() {
    }

}