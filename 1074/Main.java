import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //System.out.println("Ok");

        Scanner sc = new Scanner(System.in);
        int numerIn = sc.nextInt();
        int valorAComparar = 0;
        String resultado = "";

        for(int i = 0; i < numerIn; i++){
            
            valorAComparar = sc.nextInt();

            if(valorAComparar == 0){
                System.out.println("NULL");
            }
            
            if(valorAComparar % 2 == 0){
            resultado = "EVEN";
            if(valorAComparar > 0){
                resultado = resultado + " POSITIVE";
                    System.out.println(resultado);
                    //break;
                }
            }

            if (valorAComparar % 2 == 0) {
                resultado = "EVEN";
                if (valorAComparar < 0) {
                    resultado = resultado + " NEGATIVE";
                    System.out.println(resultado);
                    // break;
                }
            }

            if(valorAComparar % 2 == 1 || valorAComparar % 2 == -1 ){
            resultado = "ODD";
            if(valorAComparar > 0){
                resultado = resultado + " POSITIVE";
                    System.out.println(resultado);
                    //break;
                }
            }

            if(valorAComparar % 2 == 1 || valorAComparar % 2 == -1){
            resultado = "ODD";
            if(valorAComparar < 0){
                resultado = resultado + " NEGATIVE";
                    System.out.println(resultado);
                    //break;
                }
            }


        }
        sc.close();


    }
}
