import java.util.Locale;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    int a, b, prod;
    a = scanner.nextInt();
    b = scanner.nextInt();

    prod = a * b;
    System.out.println("PROD = " + prod);
    }
}
