import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		String[] nomes = new String[10];
		
		for(int i=0 ; i<10 ; i++)
			nomes[i] = scanner.next();
        
        for(int q = 0; q < 10; q++){
            if(q == 2){
                System.out.println(nomes[q]);
            }else if(q == 6){
                System.out.println(nomes[q]);
            }else if(q == 8){
                System.out.println(nomes[q]);
            }
        }
    }
}
