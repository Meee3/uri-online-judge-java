import java.util.Locale;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int A, B, maior, menor; // m = n . k
        
        A = sc.nextInt();
        B = sc.nextInt(); 
        maior = 0;
        menor = 0;

        if(A > B){
            maior = A;
            menor = B;
        }else{
            maior = B;
            menor = A;
        }

        if(maior % menor == 0) {
            System.out.println("Sao Multiplos");
        }else {
            System.out.println("Nao sao Multiplos");
        }
 
        
         sc.close();

      /*  A = sc.nextInt();
        B = sc.nextInt();
        k = 0;
        result = 1;

        k = 2;

        while( result != 0){
            result = B / k;
            result += B % k;
            System.out.println(result);
        }*/

     /*   A = sc.nextInt();

        B = sc.nextInt();
        if((B % A) == 0){
            System.out.println("Sao Multiplos");
        }else if((B % A) == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }*/
       
// B = A . K // 6 24

       
/*
        while(result != B){
       result = A * k;
       k +=1;
       System.out.println(result);
    }

       if( result == B){
         System.out.println("São Multiplos");
       } 
       */

 
    }
}