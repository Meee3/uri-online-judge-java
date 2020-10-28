import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner (System.in);


        double A, B, C, delta, bhaskara1, bhaskara2;

        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();

        delta = Math.pow(B,2) - 4 * A * C;

        bhaskara1 = (- B + Math.sqrt(delta)) / (2 * A);
        bhaskara2 = (- B - Math.sqrt(delta)) / (2 * A);

        if (delta < 0 || A == 0){
            System.out.println("Impossivel calcular");

        }else{
            System.out.printf("R1 = %.5f%n",bhaskara1);
            System.out.printf("R2 = %.5f%n",bhaskara2);
            
        }

  






        scan.close();


    }
}