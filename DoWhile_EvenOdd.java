package loop_types;

public class DoWhile_EvenOdd {

    public static void main(String[] args) {

        int a = 18;
        int i = 0;

        System.out.print("Even numbers are:");

        do {
        System.out.println(i + " ");
        i += 2;
        } while (i <= a);

        System.out.println("........................");

        System.out.println("Odd numbers are:");
        i = 1;

        do {
        System.out.println(i + " ");
        i += 2;
        }
        while (i <= a);
    }
}