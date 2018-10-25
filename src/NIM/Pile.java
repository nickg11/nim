package NIM;

public class Pile {
    public int sticks;

    public Pile() {
        sticks = 10;
    }

    public Pile(int size) {
        sticks = size;
    }

    public int get(Pile p) {
        return p.sticks;
    }

    public String getSize(Pile a, Pile b, Pile c) {
        return ("A   B   C \n" + a + "   " + b + "   " + "   " + c);
    }

    public void remove(int amount, Pile p) {
        p.sticks -= amount;
    }
}
