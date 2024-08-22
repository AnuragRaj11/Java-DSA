import java.util.*;

public class Stringg {
    public static void main(String[] args) {
        String a = "raj";
        String b = "raj";
        System.out.println(a == b);

        String c = "raj ";
        System.out.println(a.equals(c));

        System.out.println(Arrays.toString(a.toCharArray()));
        System.out.println("   skalka  ".strip());
        System.out.println(Arrays.toString(c.split(" ")));

        System.out.println("a" + "b");
        System.out.println("ab" + 'c');

        float n = 112.2353f;
        System.out.printf("this is number %2f",n);
        System.out.printf("hello %s and nice %s","anu","cool");

    }
}
