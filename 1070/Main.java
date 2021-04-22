import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Ok");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int contador = 0;

        for(int count = -6; true ; ){

            if(number % 2 == 1){
                System.out.println(number);
                contador += 1;
                if(contador == 6){
                    break;
                }
            }
            number++;
        }
        
        sc.close();

    }
}
