import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        //System.out.println("Ok");

        Scanner entrada = new Scanner(System.in);

        int number = 0;
        int pares = 0;
        int impares = 0;
        int negativos = 0;
        int positivos = 0;
        
        for(int contador = 0; contador < 5; contador++){
            number = entrada.nextInt();

            if(number % 2 == 0){
                pares++;
            }

            if(number % 2 == 1 || number % 2 == -1){
                impares++;
            }

            if(number > 0 ){
                positivos++;
            }

            if(number < 0){
                negativos++;
            }
            


        }


        entrada.close();


        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");

    }
}