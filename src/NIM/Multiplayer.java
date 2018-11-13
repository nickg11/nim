/*
The game of NIM (Misère rules)
Multiplayer class
Created by: Phoenix Remington and Nicholas Gingras
Last modified: 11/13/2018
 */


package NIM;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;

public class Multiplayer {
    Scanner input = new Scanner(System.in);
    //Nim Nim = new Nim();
    Pile Pile = new Pile(0);
    public Pile pileA;
    public Pile pileB;
    public Pile pileC;
    int[] players;
    int gameState = 236598741;                                                                              // Gives gamestate a value that is not at all reasonable (for loop purposes)
    int size;


    public Multiplayer() {

    }

    private void playerCreation() {
        //Makes the players array
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

    public void pileCreation() {
        //Makes the piles
        out.println("How many sticks would you like to be in each  of the 3 piles ");

        while (true) {
            try {
                size = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                out.println("Please give me an actual number.");
            }
        }
        pileA = new Pile(size);
        pileB = new Pile(size);
        pileC = new Pile(size);
    }

    public void MultiPlayerMove() {
        //Runs one player move
        int playerNum;
        char playerChoice;
        out.println(Pile.getSize(pileA, pileB, pileC));
        do {
            out.print("Select a pile: ");
            playerChoice = Character.toLowerCase(input.next().charAt(0));
        }
        while (playerChoice != 'a' && playerChoice != 'b' && playerChoice != 'c');
        switch (playerChoice) {
            case 'a':
                out.print("How many do you want to remove? ");
                while (true) {
                    try {
                        playerNum = input.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        out.println("Please give me an actual number.");
                    }
                }
                while (playerNum > pileA.sticks || playerNum < 1) {
                    out.println("You have picked more sticks than there are in pile A please pick again.");
                    out.print("How many do you want to remove? ");
                    while (true) {
                        try {
                            playerNum = input.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            out.println("Please give me an actual number.");
                        }
                    }
                }
                Pile.remove(playerNum, pileA);
                break;
            case 'b':
                out.print("How many do you want to remove? ");
                while (true) {
                    try {
                        playerNum = input.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        out.println("Please give me an actual number.");
                    }
                }
                while (playerNum > pileB.sticks || playerNum < 1) {
                    out.println("You have picked more sticks than there are in pile B please pick again.");
                    out.print("How many do you want to remove? ");
                    while (true) {
                        try {
                            playerNum = input.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            out.println("Please give me an actual number.");
                        }
                    }
                }
                Pile.remove(playerNum, pileB);
                break;
            case 'c':
                out.print("How many do you want to remove? ");
                while (true) {
                    try {
                        playerNum = input.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        out.println("Please give me an actual number.");
                    }
                }
                while (playerNum > pileC.sticks || playerNum < 1) {
                    out.println("You have picked more sticks than there are in pile C please pick again.");
                    out.print("How many do you want to remove? ");
                    while (true) {
                        try {
                            playerNum = input.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            out.println("Please give me an actual number.");
                        }
                    }
                }
                Pile.remove(playerNum, pileC);
                break;
        }
        if (Pile.get(pileA) + Pile.get(pileB) + Pile.get(pileC) == 1) {
            out.println("Congrats! You Won");
            gameState = 0;
        }
    }

    public void MultiGameplay() {
        //runs the game
        playerCreation();
        pileCreation();
        int i = 1;
        while (gameState != 1 && gameState != 0) {
            for (int x = 1; x <= players.length; x++) {
                out.println("Player " + (i));
                MultiPlayerMove();
                i++;
                if (gameState <= 1) {
                    break;
                }
            }
            i = 1;
        }
    }
}