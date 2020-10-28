import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner (System.in);

        float n;
        String a, b, c, d;


        n = scan.nextFloat();
        a = "[0,25]";
        b = "(25,50]";
        c = "(50,75]";
        d = "(75,100]";

        
        if (n > 0 & n < 25.00001f){
            System.out.println("Intervalo " + a);
        } else if ( n >= 25.00001f & n <= 50.0000000f){
            System.out.println("Intervalo " + b);
        } else if (n > 50.0000000f & n <= 75.0000000f){
            System.out.println("Intervalo " + c);
        } else if (n > 75.0000000f & n <= 100.000000000f){
            System.out.println("Intervalo " + d);
        }else{
            System.out.println("Fora de intervalo");
        }


        scan.close();
    }
}