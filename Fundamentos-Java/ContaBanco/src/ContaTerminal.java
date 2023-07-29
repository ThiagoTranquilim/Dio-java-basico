import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    int numero;
    String agencia, nomeCliente;
    double saldo;

    System.out.println("Por favor, digite o número da Agência: ");
    numero = scanner.nextInt();

    System.out.println("Por favor, digite o nome da Agência: ");
    agencia = scanner.next();

    System.out.println("Por favor, digite seu nome: ");
    nomeCliente = scanner.next();

    System.out.println("Por favor, digite seu saldo: ");
    saldo = scanner.nextDouble();

    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque%n", nomeCliente, agencia, numero, saldo);
    }
}
