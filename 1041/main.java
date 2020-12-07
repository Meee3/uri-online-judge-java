import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    //System.out.println("Hello");

    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    float X = sc.nextFloat();
    float Y = sc.nextFloat();

    if( X > 0 && Y < 0){
        System.out.println("Q4");
    }

    if( X > 0 && Y > 0){
        System.out.println("Q1");
    }

    if( X < 0 && Y < 0){
        System.out.println("Q3");
    }

    if( X < 0 && Y > 0){
        System.out.println("Q2");
    }

    if( X == 0 && Y == 0){
        System.out.println("Origem");
    }

    if(X != 0 && Y == 0){
        System.out.println("Eixo X");
    }
    if(Y != 0 && X == 0){
        System.out.println("Eixo Y");
    }

    }
}