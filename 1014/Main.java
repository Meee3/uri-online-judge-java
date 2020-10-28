import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        int X = sc.nextInt();
        double y = sc.nextDouble();
        double result = ( X * 1.000) / y;

        System.out.printf("%.3f",result);
        System.out.println(" km/l");



        sc.close();
    }
}