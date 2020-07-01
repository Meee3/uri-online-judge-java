import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);


        int cod1 = sc.nextInt();
        int qnt1 = sc.nextInt();
        double price1 = sc.nextDouble();

        sc.nextLine();

        int cod2 = sc.nextInt();
        int qnt2 = sc.nextInt();
        double price2 = sc.nextDouble();

        double result = (qnt1 * price1) + (qnt2 * price2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", result);
        sc.close();
    }
    
}