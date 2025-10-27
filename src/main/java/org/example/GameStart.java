package org.example;

import org.example.characters.Adventurer;
import org.example.characters.Boss;
import org.example.characters.Monsters;
import org.example.characters.Weapon;
import org.example.info.Rules;
import org.example.info.Help;
import org.example.rooms.Room;
import org.example.rooms.RoomRandomizer;
import org.example.utils.Helper;

import java.util.Scanner;

public class GameStart {

    private final Weapon weapon = new Weapon("Whip", 15);
    private final Adventurer adventurer = new Adventurer("DefaultName", 100, 10);
    private final Scanner scanner = new Scanner(System.in);
    private final Helper helper = new Helper();

    public GameStart() {
        adventurer.setWeapon(weapon);
    }

    public void start() {

        System.out.println("Set the name of your adventurer to take on this foul world: ");
        adventurer.setName(scanner.nextLine());
        System.out.println("Welcome " + adventurer.getName() + " your journey begins here.");

    }

    public void Menu() {
        boolean run = true;

        Help help = new Help();
        Rules rules = new Rules();

        while (run) {
            System.out.println("Menu");
            System.out.println("1. Start game");
            System.out.println("2. Rules");
            System.out.println("3. HowTo");
            System.out.println("4. Quit");

            String pick = scanner.nextLine();

            switch (pick) {
                case "1":
                    System.out.println("Starting game: ");
                    helper.sleepForMilliSeconds(1000);
                    play();
                    break;
                case "2":
                    helper.sleepForMilliSeconds(500);
                    rules.rules();
                    helper.sleepForMilliSeconds(1000);
                    break;
                case "3":
                    helper.sleepForMilliSeconds(500);
                    help.helpTips();
                    helper.sleepForMilliSeconds(1000);
                    break;
                    case "4":
                    System.out.println("See you next time");
                    run = false;
                    break;
                default:
                    System.out.println("Nice try, try again.");
            }
        }
    }

    public void play() {
        while (adventurer.isAlive()) {
            System.out.println("Choose where to go, North, South, East, West) or type quit, if you dare type: boss");
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("quit")) {
                System.out.println("You left");
                break;
            } else if (input.equals("boss")) {
                System.out.println("You entered the chamber of the sphinx");
                Monsters boss = new Boss();
                fighting(adventurer, boss);
                if (!adventurer.isAlive()) {
                    System.out.println("You died to the hardest boss in the game..");
                    System.out.println("--------------------");
                    Menu();
                } else {
                    System.out.println("You won the game congrats! hardest game in the world!!!");
                    System.out.println("--------------------");
                    helper.sleepForMilliSeconds(1000);
                    break;
                }
            } else if (input.equals("status")) {
                System.out.println("Status of your adventurer " + "Damage: "+ adventurer.getDamage() + " Max health: " + adventurer.getMaxHealth() + " Experience: " + adventurer.getExperience() + " Level: " + adventurer.getLevel() + " Bonus weapon damage: " + weapon.getBonusDamage() + " Weapon name: "+ weapon.getName());
            } else {
                Room room = RoomRandomizer.randomRoom();
                Monsters monster = room.enter(adventurer);

                if (monster != null) {
                    fighting(adventurer, monster);
                    if (!adventurer.isAlive()) {
                        System.out.println("You died!! game over pal.");
                        break;
                    }
                }
            }
        }
    }


    public void fighting(Adventurer adventurer, Monsters monsters) {

        while (adventurer.isAlive() && monsters.isAlive()) {
            adventurer.attack(monsters);
            helper.sleepForMilliSeconds(1000);

            if (!monsters.isAlive()) {
                System.out.println(monsters.getName());
                adventurer.gainExperience(75);
                break;
            }

            if (monsters instanceof Boss boss) {
                boss.attack(adventurer);
                boss.specialAbility(adventurer);
            }else {
                monsters.attack(adventurer);
            }
            helper.sleepForMilliSeconds(1000);

            if (!adventurer.isAlive()) {
                System.out.println("You died, Game over!!");
                break;
            }
        }
    }
}