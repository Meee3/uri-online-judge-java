import java.util.Locale;
import java.util.Scanner;


public class vai {
        public static void main(String[] args) {
            

            float n, nota, resto, result;

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner (System.in);

            n = sc.nextFloat();

            nota = (int) n / 100;
            System.out.println(nota);

        }
    
}