import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int SOMA = a + b;

        System.out.println("SOMA = " + SOMA);








        sc.close();




    }
}