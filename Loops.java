import java.util.*;

public class Loops {
    public static void main(Stringg args[]) {

        int loop = 4;

        if (loop < 4) {
            System.out.println(loop + 4);
        } else {
            System.out.println(loop - 2);
        }

        for (int n = 1; n <= 7; n += 1) {
            System.out.println(n);
        }

        int w = 1;
        while (w <= 5) {
            System.out.println(w);
            w += 2;
        }

        int d = 1;
        do {
            System.out.println("hello");
            d++;
        } while (d != 5);

        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int sa = in.nextInt();
        switch (sa) {
            case 1:
                System.out.println("small");
                break;
            case 2:
                System.out.println("medium");
                break;
            case 3:
                System.out.println("large");
                break;
            default:
                System.out.println("invalid");
        }

    }
}
