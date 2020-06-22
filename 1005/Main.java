import java.util.Scanner;
import java.util.Locale;

public class Main {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner (System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double pesoA = 3.5;
        double pesoB = 7.5;
        double media = (A * pesoA + B * pesoB )/(pesoA + pesoB);

        System.out.printf("MEDIA = %.5f%n",media);




        sc.close();

    }

}