import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        double A = 0.15;
        String name = sc.next();
        double salary = sc.nextDouble();
        double seller = sc.nextDouble();
        double result = seller * A + salary;

        System.out.printf("TOTAL = R$ %.2f%n", result);




        sc.close();
    }
    
}