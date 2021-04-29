import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int valorDeCasos = sc.nextInt();
        sc.nextLine();

        double[] guardaValores = new double[valorDeCasos];

        for(int j = 0; j < valorDeCasos; j++){
        for(int i = 0; i < valorDeCasos;i++){
            double ValorLeitura = sc.nextDouble();
            guardaValores[i] = ValorLeitura;
            }
        //Hora da Continha
        double mediaPonderada = ((guardaValores[0]*2)+ (guardaValores[1]*3)+ (guardaValores[2]*5)) / (2+3+5);        
        System.out.printf("%.1f%n",mediaPonderada);
    }
    sc.close();

    }
}
