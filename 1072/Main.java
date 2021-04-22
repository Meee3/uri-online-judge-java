import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Ok");

        //Primeira entrada Qtd de Testes
        //range 10 a 20
        // os numeros dentros disto vai para o in
        // os numeros fora deste intervalo vai para out
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        int laVariacion = 0;
        int dentroDoRange = 0;
        int foraDoRange = 0;

        for(int a = 0; a < entrada; a++){
            
            laVariacion = sc.nextInt();

            if(laVariacion >= 10 && laVariacion <= 20){
            dentroDoRange += 1;
            }else{
                foraDoRange += 1;
            }
            }


            sc.close();
        System.out.format("%d in%n", dentroDoRange);
        System.out.format("%d out%n", foraDoRange);

    }
}
