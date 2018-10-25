package NIM;

import java.util.*;

public class Nim {
    Pile name = new Pile();
    private Pile pileA;
    private Pile pileB;
    private Pile pileC;
    private Random rnd = new Random();
    private Scanner input = new Scanner(System.in);

    public Nim() {
        System.out.println("dont be dum");
        pileA = new Pile();
        pileB = new Pile();
        pileC = new Pile();
    }

    public void computerRandomMove() {
        System.out.println("It is a AI's turn");
        int choice = rnd.nextInt(3) + 1;
        while ((choice == 1 && pileA.sticks == 0) || (choice == 2 && pileB.sticks == 0) || (choice == 3 && pileC.sticks == 0)) {
            choice = rnd.nextInt(3) + 1;
        }
        switch (choice) {
            case 1:
                int bound = name.get(pileA);
                int num = rnd.nextInt(bound) + 1;
                System.out.println("The AI has chosen pile A and has removed " + num + " sticks");
                name.remove(num, pileA);
                System.out.println(name.getSize(pileA, pileB, pileC));
                break;
            case 2:
                bound = name.get(pileB);
                num = rnd.nextInt(bound) + 1;
                System.out.println("The AI has chosen pile B and has removed " + num + " sticks");
                name.remove(num, pileB);
                System.out.println(name.getSize(pileA, pileB, pileC));
                break;
            case 3:
                bound = name.get(pileC);
                num = rnd.nextInt(bound) + 1;
                System.out.println("The AI has chosen pile C and has removed " + num + " sticks");
                name.remove(num, pileC);
                System.out.println(name.getSize(pileA, pileB, pileC));
                break;
        }
        if (name.get(pileA) + name.get(pileB) + name.get(pileC) == 1) {
            System.out.println("Too bad! YOU LOSE!");
        }
    }

    public void playerMove() {
        int playerNum;
        char playerChoice;
        do {
            System.out.print("Select a pile: ");
            playerChoice = Character.toLowerCase(input.next().charAt(0));
        }
        while (playerChoice != 'a' && playerChoice != 'b' && playerChoice != 'c');
        switch (playerChoice) {
            case 'a':
                System.out.print("How many do you want to remove? ");
                playerNum = input.nextInt();
                while (playerNum > pileA.sticks || playerNum < 1) {
                    System.out.println("You have picked more sticks than there are in pile A please pick again.");
                    System.out.print("How many do you want to remove? ");
                    playerNum = input.nextInt();
                }
                name.remove(playerNum, pileA);
                break;
            case 'b':
                System.out.print("How many do you want to remove? ");
                playerNum = input.nextInt();
                while (playerNum > pileB.sticks || playerNum < 1) {
                    System.out.println("You have picked more sticks than there are in pile B please pick again.");
                    System.out.print("How many do you want to remove? ");
                    playerNum = input.nextInt();
                }
                name.remove(playerNum, pileB);
                break;
            case 'c':
                System.out.print("How many do you want to remove? ");
                playerNum = input.nextInt();
                while (playerNum > pileC.sticks || playerNum < 1) {
                    System.out.println("You have picked more sticks than there are in pile C please pick again.");
                    System.out.print("How many do you want to remove? ");
                    playerNum = input.nextInt();
                }
                name.remove(playerNum, pileC);
                break;
        }
        System.out.println(name.getSize(pileA, pileB, pileC));
        if (name.get(pileA) + name.get(pileB) + name.get(pileC) == 1) {
            System.out.println("Congrats! You Won");
        }
    }

    public void theGaym() {
        int gameState = 1;
        System.out.println(name.getSize(pileA, pileB, pileC));
        while (gameState >= 1) {
            playerMove();
            computerRandomMove();
            gameState = name.get(pileA) + name.get(pileB) + name.get(pileC);
        }
    }
}
