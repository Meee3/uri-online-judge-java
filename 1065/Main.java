import java.util.Scanner;
public class Main{
    public static void main(String[] args){
//        System.out.println("Ok");

        Scanner in = new Scanner(System.in);
        int number = 0;
        int entrada = 0;
        int resultado = 0;

        for(int count =0; count < 5; count++){
            entrada = in.nextInt();
            number = Math.abs(entrada);

            if(number % 2 == 0){
                resultado++;
            }
            
            
        }

        in.close();
        //%f -float %d intenger %s string %n pula linha 
        System.out.printf("%d valores pares%n",resultado);
    
    }
}