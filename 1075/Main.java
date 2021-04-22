import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //System.out.println("Ok");

        //Entrar com um valor X e somar com o resto  2
        // ate o valor 100000

        Scanner in = new Scanner (System.in);
        final int valorX = in.nextInt();
        in.close();
        final int resto = 2;
        int inicio = valorX + resto;
        int contador = 0;

        
        System.out.println(2);
        System.out.println(inicio);
        
        for(int a = 0; a <= 10000; a++){
            //contador += 1;
            inicio += valorX;

            if (inicio > 10000) {
            break;
            }
            System.out.println(inicio);

            //if(contador % 2 == 0)





    }
}}

