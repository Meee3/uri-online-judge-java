/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		//Mostrar o numero par até o numero de entrada
		//Elevar o mesmo número ao quadrado
		// saida 2^2 = 4
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int resultado = 0;

        for(int a = 1; a <= number; a++){
            
            if(a % 2 == 0){
                resultado = a * a;
                System.out.println(a + "^" + 2 + " = " + resultado );
            }
            
        }



        sc.close();
	}
}
