import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);


        int X,Y;
        int menor, maior, soma;

        X = sc.nextInt();
        Y = sc.nextInt();
        soma = 0;

        if(X > Y){
            menor = Y;
        }else{
            menor = X;
        }

        if(X > Y){
            maior = X;
        }else{
            maior = Y;
        }

       //System.out.println(menor);
       //System.out.println(maior);

        for(int i = menor +1; (i<= maior-1); i++){
        
            if(i % 2 !=0){
                soma +=i;
               // System.out.println(soma);   
            }
        }
        System.out.println(soma);


        sc.close();
    }
    
}