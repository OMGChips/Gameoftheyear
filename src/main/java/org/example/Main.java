package org.example;
import org.example.characters.Adventurer;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Adventurer adventurer = new Adventurer("DefaultName", 100, 20);

        System.out.println("Set the name of your adventurer to take on this foul world: ");
        adventurer.setName(scanner.nextLine());
        System.out.println( "Welcome " + adventurer.getName() + " your journey begins here.");


    }
}