import java.util.Locale;
import java.util.Scanner;

public class Desafio03 {
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    double nota1, nota2, media;
    nota1 = scanner.nextDouble();
    nota2 = scanner.nextDouble();

    media = (nota1 * 3.5 + nota2 * 7.5)/11;

    System.out.printf("MEDIA = %.5f", media);
    System.out.println();
    }
}