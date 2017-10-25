package recursion;

public class Recusion {
    public static void main(String[] args) {
        bunnyEars(4);
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0)
            return 0;

        int loQueDevuelve =  bunnyEars(bunnies -1);
        return 2 + loQueDevuelve;
    }
}

