import java.util.Scanner;
import java.util.Locale;

public class Main {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner (System.in);
        double n;
        double pi = 3.14159;
        double area;

        n = sc.nextDouble();
        area = pi * (Math.pow(n, 2));

        System.out.printf("A=%.4f%n",area);


        sc.close();
    }
    
}