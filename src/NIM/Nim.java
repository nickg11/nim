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
        int choice = rnd.nextInt(3) + 1;
        switch (choice) {
            case 1:
                int num = rnd.nextInt(name.get(pileA)) + 1;
                name.remove(num, pileA);
                System.out.println(name.getSize(pileA, pileB, pileC));
                break;
            case 2:
                num = rnd.nextInt(name.get(pileB)) + 1;
                name.remove(num, pileB);
                System.out.println(name.getSize(pileA, pileB, pileC));
                break;
            case 3:
                num = rnd.nextInt(name.get(pileC)) + 1;
                name.remove(num, pileC);
                System.out.println(name.getSize(pileA, pileB, pileC));
                break;
        }
    }

    public void playerMove() {
        int playerNum;
        System.out.print("Select a pile: ");
        char playerChoice = Character.toLowerCase(input.next().charAt(0));
        if (playerChoice == 'a') {
            System.out.print("How many do you want to remove? ");
            playerNum = input.nextInt();
            name.remove(playerNum, pileA);
        } else if (playerChoice == 'b') {
            System.out.print("How many do you want to remove? ");
            playerNum = input.nextInt();
            name.remove(playerNum, pileB);
        } else if (playerChoice == 'c') {
            System.out.print("How many do you want to remove? ");
            playerNum = input.nextInt();
            name.remove(playerNum, pileC);
        }
        System.out.println(name.getSize(pileA, pileB, pileC));
    }

    public void theGay() {
        int gameState = 1;
        while (gameState >= 1) {
            playerMove();
            computerRandomMove();
            gameState = name.get(pileA) + name.get(pileB) + name.get(pileC);
        }
    }
}
