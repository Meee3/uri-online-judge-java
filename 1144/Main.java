import java.io.IOException;
 import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

         Scanner sc = new Scanner(System.in);


         int N = sc.nextInt();

        //System.out.println(1 + " " + (1 * 1) + " " + (1 * 1));
        //System.out.println(1 + " " + (1 + 1) + " " + (1 + 1));
         for(int i = 1; i <= N; i ++){

            if(i<= N){
            int i2 = i * i;
            int i4 = i2 * i;        
            System.out.println(i + " " + (i2) + " " + (i4));
            System.out.println(i + " " + (i2 + 1)    + " " + (i4 + 1));



            }
         }
         sc.close();


 
    }
 
}