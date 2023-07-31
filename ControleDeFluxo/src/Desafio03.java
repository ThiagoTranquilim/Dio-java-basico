import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int C = scanner.nextInt();
		String nome;
		int N;

		for (int i = 0; i < C; i++) {
			nome = scanner.next();
			N = scanner.nextInt();
			if (nome.equals("Thor")) System.out.println("Y");
			else System.out.println("N");
		}
    }
}
