import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        float time = sc.nextInt();
        float km = sc.nextInt()*time;
        int car = 12;
        double result = km / car;


        System.out.printf("%.3f%n",result);
        sc.close();
    }
}