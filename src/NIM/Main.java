/*
The game of NIM (Misère rules)
Main class
Created by: Phoenix Remington and Nicholas Gingras
Last modified: 11/13/2018
 */
package NIM;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Nim nim = new Nim();
        Multiplayer Multiplayer = new Multiplayer();
        String s;
        String playerChoice;
        System.out.println("Welcome to NIM! NIM is a basic but fun and difficult mathematical strategy game. The rules are simple there are piles of sticks of sticks your objective is\n to not collect the last stick, you can collect as many sticks as you want per turn from the pile you selected though.");
        //Explains the rules
        do {
            System.out.println("Would you like to play Multiplayer or against AI?");        //Menu
            s = input.nextLine();
            playerChoice = s.toLowerCase();
        } while (!playerChoice.equals("multiplayer") && !playerChoice.equals("ai"));
        if (playerChoice.equals("ai")) {
            nim.AIRandomGame();
        }
        if (playerChoice.equals("multiplayer")) {
            Multiplayer.MultiGameplay();
        }
    }
}
