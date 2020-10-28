import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        int qnt, cod;
        float total;

        cod = sc.nextInt();
        qnt = sc.nextInt();

        switch (cod) {
            case 1:
            total = 4 * qnt;
            System.out.printf("Total: R$ %.2f%n", total);
            break;

            case 2:
            total = 4.5f * qnt;
            System.out.printf("Total: R$ %.2f%n", total);
            break; 
            
            case 3:
            total = 5f * qnt;
            System.out.printf("Total: R$ %.2f%n", total);
            break; 

            case 4:
            total = 2f * qnt;
            System.out.printf("Total: R$ %.2f%n", total);
            break; 

            case 5:
            total = 1.5f * qnt;
            System.out.printf("Total: R$ %.2f%n", total);
            break; 
        }

        sc.close();

    }
    
}