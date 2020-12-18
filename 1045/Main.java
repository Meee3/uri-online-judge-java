import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        // System.out.println("Funfando");
        // ler tres numeros flutuantes
        // ordernar do maior para o menor(decrescente)
    // se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
    // se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
    // se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
    // se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
    // se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
    // se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
    // A (0 < A) , B (0 < B) e C (0 < C)
        // Resultados
        // 5.0 7.0 2.0 / NAO FORMA TRIANGULO
        // 7.0 5.0 7.0 TRIANGULO ACUTANGULO TRIANGULO ISOSCELES
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        float A, B, C, result = 0;
        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();       
        sc.close();

        float[] array = {A, B, C};

//Ordem decrescente

        Arrays.sort(array);

        A = array[2];
        B = array[1];
        C = array[0];


        System.out.println(A + "" + B+ "" + C);

//Output

    if(A >= (B+C)){
        result = 1;
        System.out.println("NAO FORMA TRIANGULO");
    }
    if(result == 1){

    }else{
    if((A * A ) == (Math.pow(B,2) + Math.pow(C,2))){
        System.out.println("TRIANGULO RETANGULO");
    }

    if(Math.pow(A,2) > ((Math.pow(B,2)+ Math.pow(C,2)))){
        System.out.println("TRIANGULO OBTUSANGULO");
    }

    if(Math.pow(A,2) < Math.pow(B,2) + Math.pow(C,2)){
        System.out.println("TRIANGULO ACUTANGULO");
    }

    if((A == B & A == C)){
        System.out.println("TRIANGULO EQUILATERO");
    }
    else if(A == B || A == C || B == C){
        System.out.println("TRIANGULO ISOSCELES");
        }
    }   
    }
}