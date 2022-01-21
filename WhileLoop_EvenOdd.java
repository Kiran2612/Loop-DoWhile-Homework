package loop_types;

public class WhileLoop_EvenOdd {

    public static void main(String[] args) {

        System.out.println("Below are 10 Even numbers");

        int a = 1;
        while (a<11) {
        System.out.println(a * 2);
        a++;
        }
        System.out.println("..........................................");

        System.out.println("Below are 10 Odd Numbers");
        int b = 1;
        while(b<11) {

        System.out.println(b * 2 - 1);
        b++;
        }


    }
}

