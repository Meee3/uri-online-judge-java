import java.util.Scanner;
import java.util.Locale;

public class Main {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner (System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        double pesoA = 2.0;
        double pesoB = 3.0;
        double pesoC = 5.0;
        double media = (A * pesoA + B * pesoB + C * pesoC )/(pesoA + pesoB + pesoC);

        System.out.printf("MEDIA = %.1f%n",media);




        sc.close();

    }

}