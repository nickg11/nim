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
        do {
            System.out.println("Would you like to play Multiplayer or against AI?");
            s = input.nextLine();
            playerChoice = s.toLowerCase();
        } while (!playerChoice.equals("multiplayer") && !playerChoice.equals("ai"));
        if (playerChoice.equals("ai")) {
            System.out.println("You would like to play on easy or Xtreme");
            do {
                s = input.next();
                playerChoice = s.toLowerCase();
            } while (!playerChoice.equals("easy") && !playerChoice.equals("xtreme") && !playerChoice.equals("extreme"));
            if (playerChoice.equals("easy")) {
                nim.AIRandomGame();
            } else {
                nim.AIImpossible();
            }
        }
        if (playerChoice.equals("multiplayer")) {
            Multiplayer.MultiGameplay();
        }
    }
}
