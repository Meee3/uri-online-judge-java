import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);


        double  x1, x2, y1, y2, result;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        result = Math.sqrt((Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))));

        System.out.printf("%.4f%n", result);

        sc.close();
    }
    
}