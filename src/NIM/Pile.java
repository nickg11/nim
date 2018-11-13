/*
The game of NIM (Misère rules)
Pile class
Created by: Phoenix Remington and Nicholas Gingras
Last modified: 10/22/2018
 */
package NIM;

public class Pile {
    public int sticks;

    public Pile(int size) {
        sticks = size;
    }

    public int get(Pile p) {
        return p.sticks;
    }

    public String getSize(Pile a, Pile b, Pile c) {
        return ("A    B    C \n" + a.sticks + "   " + b.sticks + "   " + c.sticks);                    //Displays size of the piles
    }

    public void remove(int amount, Pile p) {
        p.sticks -= amount;
    }
}
