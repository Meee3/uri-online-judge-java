import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);


        //6.0 4.0 2.0  // Area = 10.0
        // forma um triangulo = s , perimetro senão 
        //calcule a area do trapezio a e b base  c Altura
        // mostrando a mensagem area = XX.X


        //float A, B, C;

        float A = in.nextFloat();
        float B = in.nextFloat();
        float C = in.nextFloat();
        float valor;

        if(((B - C) < A) && (A < (B+C) ) || (A - C) < B && B <(A+C) || (A - B) < C && C < (A+B)){
           valor = (A + B) / C ;
            System.out.printf("Perimetro = %.1f%n", valor);

        }else{
            valor = A + B + C;
            System.out.printf("Area = %.1f%n", valor);

      }




      in.close();
    }

}