package NIM;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Muliplayer {
        Scanner input = new Scanner(System.in);

    public void playerCreation() {
            int numberPlayers;
            System.out.println("How many players would you like to have? ");
        while (true) {
            try {
                numberPlayers = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please give me an actual number.");
            }
        }
            int[] players;
            players = new int[numberPlayers];
        }

}
