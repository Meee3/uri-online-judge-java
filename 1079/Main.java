import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Primeira Entrada sera o numero de casos
        // cada caso tera 3 numero float/double
        // Soma o resultado dos tres numeros e divide por 3 e o resultado sera arredondado
        // ao proximo com uma casa decimal
        
       // System.out.println("Ok");

        // Primeira Entrada sera o numero de casos
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de casos");
        int valorEntrada = sc.nextInt();

        double totalValorNotas = 0.0;
        double inValue = 0.0f;
        double[] PosicaoDasNotas = new double[valorEntrada];

        for(int i = 0; i < valorEntrada; i++){
            System.out.println("Insira o valor da Nota");
            inValue = sc.nextDouble();
            totalValorNotas += inValue;
            PosicaoDasNotas[i] = inValue;
        }
        double somaDasNotasComSeusPesos = 0.0;
      
        PosicaoDasNotas[0] += PosicaoDasNotas[0] * 2; 
        PosicaoDasNotas[1] += PosicaoDasNotas[1] * 3;
        PosicaoDasNotas[2] += PosicaoDasNotas[2] * 5;
        
        for(int i = 0; i < 3; i++){
            somaDasNotasComSeusPesos += PosicaoDasNotas[i];
            System.out.println(somaDasNotasComSeusPesos);
        }

        double media = totalValorNotas / valorEntrada;
       // double mediaPonderada = totalValorNotas / somaDasNotasComSeusPesos;
        //System.out.format("%.1f%n", media);

        sc.close();

        //System.out.println(mediaPonderada);
    }
}
