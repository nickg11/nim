package NIM;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;

public class Multiplayer {
    Scanner input = new Scanner(System.in);
    Nim Nim = new Nim();
    Pile Pile = new Pile();
    private Pile pileA;
    private Pile pileB;
    private Pile pileC;
    int[] players;
    int gameState;

    public Multiplayer() {

    }

    private void playerCreation() {


        int numberPlayers;
        out.println("How many players would you like to have? ");
        while (true) {
            try {
                numberPlayers = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                out.println("Please give me an actual number.");
            }
        }

        players = new int[numberPlayers];

    }

    private void pileCreation() {
        int sticks;
        out.println("How many sticks would you like to be in each  of the 3 piles ");
        while (true) {
            try {
                sticks = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                out.println("Please give me an actual number.");
            }
        }
        Pile pileA = new Pile(sticks);
        Pile pileB = new Pile(sticks);
        Pile pileC = new Pile(sticks);
    }

    public void MultiGameplay() {
        playerCreation();
        pileCreation();
        for (int i : players) {
            do {
                Nim.playerMove();
                gameState = Pile.get(pileA) + Pile.get(pileB) + Pile.get(pileC);
            }
            while (gameState != 1);
        }
    }

}