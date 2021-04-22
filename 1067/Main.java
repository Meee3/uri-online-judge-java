import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        //System.out.println("OK");

        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        int number = 1;

        while( number <= entrada){
            if(number % 2 == 1){
            System.out.println(number);
            
            }
            number+= 1;
        }
        sc.close();

    }
}