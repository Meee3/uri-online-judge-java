import java.util.Scanner;

public class main1 {
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

        // variáveis de entrada
        String  pontuacao;
        int horaInicio, minutoInicio, segundoInicio, horaFim, minutoFim, segundoFim, diaInicio, diaFim, totalSegundosInicio, totalSegundosFim, totalSegundos;
        int dia, hora, minuto, segundo;
        
        //Processamento
        int resultDia, result, resto;
        float resultf, restof;
        int resultInicio, resultFim;

        // :D - Valores fixados
        segundo = 1;
        minuto = 60;
        hora = 3600;
        dia = 86400; //86400

        // Entrada - Inicio

        diaInicio = sc.nextInt();
        horaInicio = sc.nextInt();
        minutoInicio = sc.nextInt();
        segundoInicio = sc.nextInt();

        //pontuacao = sc.next();
        
        // Entrada - Fim
        diaFim = sc.nextInt();
        horaFim = sc.nextInt();
        minutoFim = sc.nextInt();
        segundoFim = sc.nextInt();

        /*
        // :D - Processo - Cálculo error

        resultDia = diaFim - diaInicio;
        resultDia = resultDia * dia; // total em segundos a corrigir - OK

        horaInicio = resultDia - (dia - horaInicio * hora); // resultado
        //System.out.println(horaInicio); // continuar daqui...
        minutoInicio = minutoInicio * minuto;
        segundoInicio = segundoInicio * segundo;
        totalSegundosInicio = horaInicio + minutoInicio + segundoInicio;

        horaFim = horaFim * hora;
        minutoFim = minutoFim * minuto;
        segundoFim = segundoFim * segundo;
        totalSegundosFim = horaFim + minutoFim + segundoFim;

        totalSegundos = totalSegundosInicio + totalSegundosFim;
        System.out.println(totalSegundos);

        // Processar 2 - encontrar Dia, hora, minuto e segundo
        System.out.println(totalSegundos);
        System.out.println(dia);
        resultf = (float) (totalSegundos / dia);
        System.out.println(resultf + "Dia(s)");
        //resto = (float) (resultf * dia) - totalSegundos;
        restof = totalSegundos % dia;

        System.out.println(restof); */
/*
        result = (totalSegundos - 84600*3) / hora;
        System.out.println(result + "Hora(s)");
        resto = resto % hora;



        result = resto / minuto;
        System.out.println(result + " minuto(s)");
        resto = resto % minuto;



        result = resto / segundo;
        System.out.println(result + " segundo(s)");
        //resto = resto % minuto;

        

       // System.out.println(resultDia + "total dos dias em segundos"); // valor cheio
        //System.out.println(horaInicio + "valor da hora inicio em segundos");
        //System.out.println(totalSegundos + " valor total"); */

        //resultDia, result, resto;

        resultDia = ((diaFim - diaInicio)* dia); // 4 && 345600 - OK 
        System.out.println(resultDia + " Dia arredondado em segundos");
        
        horaInicio = ((24 - horaInicio)* hora); // 16horas && 57600
        System.out.println(horaInicio + " HorasInicio em Segundos");

        minutoInicio = (60 - minutoInicio) * minuto; // 48 minuto && 2880
        System.out.println(minutoInicio + " minutos");

        segundoInicio = ((60 - segundoInicio) * segundo); // 37 segundos
        System.out.println(segundoInicio + " Segundos");

        resultInicio = horaInicio + minutoInicio + segundoInicio;
        System.out.println(resultInicio);

        // Dados de EntradaInicio Ok

        //Processamento da DataFim

        horaFim = horaFim * hora; // 21600
        System.out.println(horaFim + " HorasFim em segundos");

        minutoFim = minutoFim * minuto; // 780
        System.out.println(minutoFim + " minutosFim em segundos");

        segundoFim = segundoFim * segundo;
        System.out.println(segundoFim + " segundoFim!");

        resultFim = horaFim + minutoFim + segundoFim;
        System.out.println(resultFim);

        result = resultInicio + resultFim;
        System.out.println(result + " total em segundos inicio e Fim");

        result = resultDia - result;
        System.out.println(result + " o tempo total efetivo");


    }
}