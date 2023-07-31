import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploExcecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        try{
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.printf("Olá, me chamo %s %s, tenho %d anos e minha altura é %.2f cm", nome, sobrenome, idade, altura);
        scanner.close();
        }catch(InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
