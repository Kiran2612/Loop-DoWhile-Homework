package loop_types;

public class ForLoop_EvenOdd {

    public static void main(String[] args) {

        System.out.println("*****10 Even numbers*****");
        int a = 20;

        for (int i=2; i<=a; i+=2) {
            System.out.println(i + "  ");
        }

        System.out.println("........................");

        System.out.println("*****10 Odd numbers*****");
        for (int i=1; i<=10; i++) {
            System.out.println(2*i-1);


        }
    }
}