import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //System.out.println("Ok");

        Scanner sc = new Scanner(System.in);
        float number = 0f;
        int armazenaValorPositivo = 0;
        float somatorioDosValoresPositivos = 0.0f;

        for(int a = 1; a <= 6; a++){

            number = sc.nextFloat();
            if(number > 0.0){
                armazenaValorPositivo++;
                somatorioDosValoresPositivos += number;
            }

        }

        sc.close();
        float resultado = somatorioDosValoresPositivos / armazenaValorPositivo;
        //System.out.println("Somatorio " + somatorioDosValoresPositivos);
        System.out.println(armazenaValorPositivo + " valores positivos");
        System.out.printf("%.1f\n",resultado);

        //System.out.println(resultado);
    }
}