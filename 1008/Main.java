import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        int A = sc.nextInt();
        int B = sc.nextInt();
        double C = sc.nextDouble();
        double salary =(double) B * C;

        System.out.printf("NUMBER = %s%n",A);
        System.out.printf("SALARY = U$ %.2f%n",salary);



        sc.close();

    }
    
}