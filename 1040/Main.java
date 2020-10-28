import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        float N1, N2, N3, N4, N5, media, media2;

        N1 = sc.nextFloat();
        N2 = sc.nextFloat();
        N3 = sc.nextFloat();
        N4 = sc.nextFloat();
        

        media = (N1 * 2.0f + N2 * 3.0f + N3 * 4.0f + N4 * 1.0f) / (2.0f + 3.0f + 4.0f + 1.0f);

        if(media >= 7){
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno aprovado.");
        }else if(media < 5){
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno reprovado.");
         
        }else if( media >= 5.0 || media <= 6.9){

                N5 = sc.nextFloat();
                media2 = (media + N5) / 2;

                if(media2 >= media){
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f%n", N5);
            System.out.println("Aluno aprovado.");            
            System.out.printf("Media final: %.1f%n", media2);

        } else {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f%n", N5);
            System.out.println("Aluno Reprovado.");            
            System.out.printf("Media final: %.1f%n", media2);

        }}
    
        



        sc.close();    }}
    