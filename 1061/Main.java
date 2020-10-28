import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        /* Dia 5
         08: 12 : 23

         Dia 9
         06: 13 : 23


            Saída
         3 dia(s)
         22 hora(s)
         1 minuto(s)
         0 segundo(s)
         */
        Scanner scan = new Scanner (System.in);

        int W1, X1, Y1, Z1, W2, X2, Y2, Z2, W, X, Y, Z, inicio, fim, duracao, resto;
        String s;
        
        //w = dia // x hora // y minuto // z segundo;

        W1 = scan.nextInt();
        X1 = scan.nextInt();
        Y1 = scan.nextInt();
        Z1 = scan.nextInt();

        W2 = scan.nextInt();
        X2 = scan.nextInt();
        Y2 = scan.nextInt();
        Z2 = scan.nextInt();

        inicio = (W1 * 24 * 60 * 60)+ (X1 * 60 * 60) + (Y1 * 60) + Z1;
        fim = (W2 * 24 * 60 * 60)+ (X2 * 60 * 60) + (Y2 * 60) + Z2;

        duracao = fim = inicio;
        System.out.println(duracao);

        W = duracao / (24*60*60);
		resto = duracao % (24*60*60);
		X = resto / (60*60);
		resto = resto % (60*60);
		Y = resto / 60;
		Z = resto % 60;
		
		System.out.println(W + " dia(s)");
		System.out.println(X + " hora(s)");
		System.out.println(Y + " minuto(s)");
		System.out.println(Z + " segundo(s)");	



         scan.close();
    }


}