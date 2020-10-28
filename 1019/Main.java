//import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, resto, horas, minutos, segundos;
        Scanner scan = new Scanner (System.in);

        N = scan.nextInt();

        horas = N / 3600;
        resto = N % 3600;

        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);


        scan.close();


    }
}