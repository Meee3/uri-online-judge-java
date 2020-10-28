import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        
    Scanner sc = new Scanner (System.in);
    Locale.setDefault(Locale.US);

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

         float n = sc.nextFloat();
         float novoSalario, reajuste, percentual;

         
         if( n > 0 & n <= 400f){

            percentual = 0.15f;
            novoSalario = (n * percentual) + n;
            reajuste = novoSalario - n;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: " + Math.round(percentual*100) + " %");
        } else if( n > 400f & n <=800f){

            percentual = 0.12f;
            novoSalario = (n * percentual) + n;
            reajuste = novoSalario - n;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: " + Math.round(percentual*100) + " %");

        } else if(n > 800f & n <= 1200){
            percentual = 0.10f;
            novoSalario = (n * percentual) + n;
            reajuste = novoSalario - n;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: " + Math.round(percentual*100) + " %");

        } else if ( n > 1200 & n <= 2000f){
            percentual = 0.07f;
            novoSalario = (n * percentual) + n;
            reajuste = novoSalario - n;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: " + Math.round(percentual*100) + " %");
        } else {
            percentual = 0.04f;
            novoSalario = (n * percentual) + n;
            reajuste = novoSalario - n;

            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.println("Em percentual: " + Math.round(percentual*100) + " %");
        }
    sc.close();
    }

         /*System.out.println("Novo sala rio: " + novoSalario);}

         System.out.println("Reajuste ganho: " + reajuste);
         System.out.println("Em percentual: " + percentual);
 */
    }
 
