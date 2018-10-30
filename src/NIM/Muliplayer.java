package NIM;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Muliplayer {
    Scanner input = new Scanner(System.in);
    public void playerCreation() {
        Nim Nim = new Nim();
        Pile Pile = new Pile();

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

    public void pileCreation() {
        int stickNum;
        System.out.println("How many sticks would you like to be in each  of the 3 piles ");
        while (true) {
            try {
                stickNum = input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please give me an actual number.");
            }
        }
        Pile pileA = new Pile(stickNum);
        Pile pileB = new Pile(stickNum);
        Pile pileC = new Pile(stickNum);
    }
}
