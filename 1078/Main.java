import java.util.Scanner;
import java.io.IOException;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        //1 x 140 = 140

        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();
    
        for( int i = 1; i <= 10; i++){
            int result = N * i;
        System.out.println(i + " x " + N + " = " + result);

    }
    sc.close();

    }
 
}
