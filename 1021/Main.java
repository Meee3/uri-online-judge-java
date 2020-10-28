import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner (System.in);


        float moedas, resto, n, nf, resultFloat, restof;
        int nota, resultInt;


        n = scan.nextFloat();
        nf = n;

        System.out.println("NOTAS:");

        nota =  (int) n;
        resultInt = nota / 100;
        resultFloat = nf / 100;
        
        System.out.println(resultInt + " nota(s) de R$ 100.00");
        resto = n % 100;
        restof = nf %100;

        nota = (int) resto;
        nf = restof;
        resultInt = nota / 50;
        resultFloat = nf / 50;

        System.out.println(resultInt + " nota(s) de R$ 50.00");
        resto = nota % 50;
        restof = nf % 50;

        nota = (int) resto;
        nf = restof;
        resultInt = nota / 20;
        resultFloat = nf / 20;
        System.out.println(resultInt + " nota(s) de R$ 20.00");
        resto = nota % 20;
        restof = nf % 20;
        
        nota = (int) resto;
        nf = restof;
        resultInt = nota / 10;
        resultFloat = nf / 10;
        System.out.println(resultInt + " nota(s) de R$ 10.00");
        resto = nota % 10;
        restof = nf % 10;

        nota = (int) resto;
        nf = restof;
        resultInt = nota / 5;
        resultFloat = nf / 5;
        System.out.println(resultInt + " nota(s) de R$ 5.00");
        resto = nota % 5;
        restof = nf % 5;

        nota = (int) resto;
        nf = restof;
        resultInt = nota / 2; /////////////////////////
        resultFloat = nf / 2;
        System.out.println(resultInt + " nota(s) de R$ 2.00");
        resto = nota % 2;
        restof = nf % 2;

        System.out.println("MOEDAS:");

        
        nota = (int) resto;
        nf = restof;
        resultInt = (int) nf / 1;
        resultFloat = nf / 1;
        System.out.println(resultInt + " moeda(s) de R$ 1.00");
        //resto = nota % 1;
        restof = nf % 1;

        float centavos = 0.5f;

        nota = (int) restof;
        nf = restof;
       
        resultInt = (int) (nota / centavos);
        resultFloat = (nf / centavos);
        System.out.println((int) resultFloat + " moeda(s) de R$ 0.50");
        //resto = nota % 5/10;
        restof = nf % centavos;

        nf = restof;
        resultFloat = nf / 0.25f;
        System.out.println((int) resultFloat + " moeda(s) de R$ 0.25");
        restof = nf % 0.25f;

        nf = restof;
        resultFloat = nf / 0.10f;
        System.out.println((int) resultFloat + " moeda(s) de R$ 0.10");
        restof = nf % 0.10f;

        nf = restof;
        resultFloat = nf / 0.05f;
        System.out.println((int) resultFloat + " moeda(s) de R$ 0.05");
        restof = nf % 0.5f;

        nf = restof;
        resultFloat = nf / 0.01f;
        System.out.println((int) resultFloat + " moeda(s) de R$ 0.01");
        restof = nf % 0.1f;



      //  moedas= restof;
        //resultFloat = moedas / 1;
        //System.out.println(moedas);
       // resto = moedas % 1;
      //  System.out.println(resto);
        //System.out.println(resto);



        scan.close();
    }
    */



    //import java.util.Scanner;
    //import java.util.Locale;


		// TODO Auto-generated method stub
		
		//int numeroInteiro;
		double restoF, numeroDouble, result;
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
		numeroDouble = scan.nextDouble();
		//numeroInteiro = (int) numeroDouble;
		
		
		//System.out.println(numeroInteiro);
		System.out.println("NOTAS:");
	
		result = numeroDouble / 100;
		System.out.println((int) result + " nota(s) de R$ 100.00");
		restoF = numeroDouble % 100;
		
		result = restoF / 50;
		System.out.println((int) result + " nota(s) de R$ 50.00");
		restoF = restoF % 50;	
		
		//System.out.println(restoF);
		
		result = restoF / 20;
		System.out.println((int) result + " nota(s) de R$ 20.00");
		restoF = restoF % 20;		
		
		result = restoF / 10;
		System.out.println((int) result + " nota(s) de R$ 10.00");
		restoF = restoF % 10;		
		
		result = restoF / 5;
		System.out.println((int) result + " nota(s) de R$ 5.00");
		restoF = restoF % 5;		

		result = restoF / 2;
		System.out.println((int) result + " nota(s) de R$ 2.00");
		restoF = restoF % 2;
		
		System.out.println("MOEDAS:");
		
		result = restoF / 1;
		System.out.println((int) result + " moeda(s) de R$ 1.00");
		restoF = restoF % 1;
		
		result = restoF / 0.5;
		System.out.println((int) result + " moeda(s) de R$ 0.50");
		restoF = restoF % 0.5;
		
		result = restoF / 0.25;
		System.out.println((int) result + " moeda(s) de R$ 0.25");
		restoF = restoF % 0.25;
		
		result = restoF / 0.10;
		System.out.println((int) result + " moeda(s) de R$ 0.10");
		restoF = restoF %  0.10;
		
		result = restoF / 0.05;
		System.out.println((int) result + " moeda(s) de R$ 0.05");
		restoF = restoF % 0.05;
		
		result = restoF / 0.01;
		System.out.println((int) result + " moeda(s) de R$ 0.01");
		restoF = restoF % 0.01f;
		

		
		
		
		
		scan.close();
		

	

}

}