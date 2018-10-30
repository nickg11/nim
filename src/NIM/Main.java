package NIM;

import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Nim nim = new Nim();
        String s;
        String playerChoice;
        do {
            System.out.println("Would you like to play Multiplayer or against AI?");
            s = input.next();
            playerChoice = s.toLowerCase();
        } while (playerChoice != "multiplayer" || playerChoice != "ai");
        if (playerChoice == "ai") {
            System.out.println("You would like to play on easy or Xtreme");
            do {
                s = input.next();
                playerChoice = s.toLowerCase();
            } while (playerChoice != "easy" || playerChoice != "xtreme" || playerChoice != "extreme");
            if (playerChoice == "easy") {
                nim.AIRandomGame();
            } else {
                nim.AIImpossible();
            }
        }


        System.out.println(playerChoice);

    }
}
