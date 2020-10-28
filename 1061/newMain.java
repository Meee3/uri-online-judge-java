import java.util.Scanner;

public class newMain {
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

        Scanner sc = new Scanner (System.in);

        int dia, hora, minuto, segundo;
        float diaInicio, horaInicio, minutoInicio, segundoInicio;
        float diaFim, horaFim, minutoFim, segundoFim;
        float resultInicio, resultFim, diaTotal;

        // :D - Valores fixados
        segundo = 1;
        minuto = 60;
        hora = 3600; 
        dia = 86400; //

        // Entrada - Inicio

        diaInicio = sc.nextFloat();
        horaInicio = sc.nextFloat();
        minutoInicio = sc.nextFloat();
        segundoInicio = sc.nextFloat();

        //pontuacao = sc.next();
        
        // Entrada - Fim
        diaFim = sc.nextFloat();
        horaFim = sc.nextFloat();
        minutoFim = sc.nextFloat();
        segundoFim = sc.nextFloat();

        // momento do cálculo!

        resultInicio = (dia - (horaInicio * hora));

        System.out.println(resultInicio + " horas do primeiro dia! em segundos!");

        resultInicio = resultInicio + (minutoInicio * minuto); 

        System.out.println(resultInicio + " horas e minutos em segundos");

        resultInicio = resultInicio + (segundoInicio * segundo) ;

        System.out.println(resultInicio + " Total dos segundos");


        resultFim = horaFim * hora;

        System.out.println(resultFim + " horaFim em segundos");

        resultFim = resultFim + minutoFim * minuto;

        System.out.println(resultFim + " minutos em Segundos");

        resultFim = resultFim + segundoFim;

        System.out.println(resultFim + " segundos");

         resultFim = resultInicio + resultFim; // paralelos

         diaTotal = ((diaFim - diaInicio)*dia);

        System.out.println(resultFim + " em dia totais em segundos");

        diaTotal = diaTotal - resultFim; 

        System.out.println(diaTotal);


        sc.close();


    }
}