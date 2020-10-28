import java.util.Scanner;

public class Test {

    public static void main (final String[] args) {

        final Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int j = sc.nextInt();

        if(n == 1){
            System.out.println("1");;
        } else if( n == 3){
            n = 3*n + 1;
        } else {
            n = n / 2;
        }


        sc.close();

    }
}