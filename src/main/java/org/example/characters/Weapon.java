package org.example.characters;

public class Weapon {


    public Weapon(String name, int bonusDamage){
        this.name = name;
        this.bonusDamage = bonusDamage;
    }
    private String name;
    private int bonusDamage;

    public String getName(){
        return name;
    }

    public int getBonusDamage(){
        return bonusDamage;
    }


}
