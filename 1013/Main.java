import java.util.Scanner;

public class Main {
    
    public static void main (String[] arg){
        
        Scanner sc = new Scanner (System.in);

        int a, b, c, result, result1;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        result = (a+b+Math.abs(a-b))/2;
        result1 = (result + c + Math.abs(result - c))/2;


        System.out.println(result1 + " eh o maior");

        sc.close();
    }
}