import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) {

        /**
         * Escreva a sua solução aqui Code your solution here Escriba su solución aquí
         */

        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int x;

        a = sc.nextInt();
        b = sc.nextInt();
        x = a + b;

        System.out.println("X = " + x);

        sc.close();
    }


}