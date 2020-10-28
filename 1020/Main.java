    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            int n, ano, mes, dia, result, resto;
            Scanner scan = new Scanner (System.in);

            ano = 365;
            mes = 30;
            dia = 1;

            n = scan.nextInt();
            
            result = n / ano ;
            System.out.println(result + " ano(s)");
            resto = n % ano;

            n = resto;
            result = n / mes;
            System.out.println(result + " mes(es)");
            resto = n % mes;

            n = resto;
            result = n / dia;
            System.out.println(result + " dia(s)");
            

            scan.close();
        }
    }