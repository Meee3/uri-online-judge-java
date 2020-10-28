import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        float x, y;

        x = sc.nextFloat();
        y = sc.nextFloat();

        if ( x == 0.0f & y == 0.0f){

            System.out.println("Origem");

        }else if( x > 0 & y >= 0){
            System.out.println("Q1");

        }else if ( x <= 0 & y > 0){
            System.out.println("Q2");
        }else if( x < 0 & y < 0){
            System.out.println("Q3");
        }else{
            System.out.println("Q4");
        }

        sc.close();

    }
    

}