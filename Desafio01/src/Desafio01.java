import java.util.Locale;
import java.util.Scanner;

public class Desafio01 {
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    int a, b, soma;
    a = scanner.nextInt();
    b = scanner.nextInt();

    soma = a + b;
    System.out.println("SOMA = " + soma);
    }
}
