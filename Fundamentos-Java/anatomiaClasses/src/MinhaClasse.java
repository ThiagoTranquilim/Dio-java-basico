import java.util.Scanner;

public class MinhaClasse {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        String nomeCompleto = NomeCompleto(nome, sobrenome);
        System.out.print(nomeCompleto);
    }

    public static String NomeCompleto(String nome, String sobrenome){
        return nome.concat(" ").concat(sobrenome);
    }
}
