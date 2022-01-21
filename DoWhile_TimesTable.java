package loop_types;

public class DoWhile_TimesTable {

    public static void main(String[] args) {

        int num=7;
        int i=1;

        System.out.println(" ----- Do While 7 Times Table ----- ");

        do{
        System.out.println(num+"*"+i+" = "+num*i);
        i++;
        }
        while( i<=10);
    }
}

