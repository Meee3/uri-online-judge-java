import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner in = new Scanner (System.in);
       int n1, n2, n3, min, med, max;
       n1 = in.nextInt();
       n2 = in.nextInt();
       n3 = in.nextInt();
       int[] vetor = new int[3]; // cria três espaços
       vetor[0] = n1; // começa a conta do zero
       vetor[1] = n2;
       vetor[2] = n3;
       max = 0;
       med = 0;
       min = 0;

    if ( vetor[0] > vetor[1] & vetor[0] > vetor[2] & vetor[1] > vetor[2]){
        max = vetor[0];
        med = vetor[1];
        min = vetor[2];
    }else if (vetor[0] < vetor[1] & vetor [0] < vetor[2] & vetor[1] < vetor[2]) {
        max = vetor[2];
        med = vetor[1];
        min = vetor[0];
    }else if ( vetor[0] > vetor[1] & vetor[0] < vetor[2] & vetor [1] < vetor[2]) {
        max = vetor[2];
        med = vetor[0];
        min = vetor[1];
    }else if( vetor[1] > vetor[0] & vetor[1] > vetor[2] & vetor[2] > vetor[0]){
        max = vetor[1]; 
        med = vetor[2];
        min = vetor[0];
    }else if (vetor[2] < vetor[0] & vetor[2] < vetor[1] & vetor[0] < vetor[1]){
        max = vetor[1]; 
        med = vetor[0];
        min = vetor[2];
    }else {  
        max = vetor[0]; 
        med = vetor[2];
        min = vetor[1];
    }
    System.out.println(min);
    System.out.println(med);
    System.out.println(max);
    System.out.println();
    System.out.println(n1);
    System.out.println(n2);
    System.out.println(n3);
    in.close();
    }
}