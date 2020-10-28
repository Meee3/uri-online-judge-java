import java.util.Scanner;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {
        

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int X = sc.nextInt();
        int Y = X * 2; // cheating
        System.out.printf("%d", Y);
        System.out.println(" minutos");
        sc.close();
    }
    
}