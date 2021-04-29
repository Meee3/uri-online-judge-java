import java.util.ArrayList;
import java.util.Scanner;



public class Main {


public void percorreOMaior(int number){
    return;
}

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int Total = 100;
        int[] AlocaOsNumeros = new int[Total];

        int maiorValor = 0;
        int posicaoDoValor = 0;
        int valorMenor = -999;
        for(int i = 0; i < Total; i++){

            AlocaOsNumeros[i] += in.nextInt();
        }

        for(int i = 0; i< Total; i++){
            
            if(valorMenor < AlocaOsNumeros[i]){
                maiorValor = AlocaOsNumeros[i];
                posicaoDoValor = i;
                valorMenor = AlocaOsNumeros[i];
            }
            
        }

        System.out.println(maiorValor);
        System.out.println(posicaoDoValor+1);
            
        in.close();

    }        
}

