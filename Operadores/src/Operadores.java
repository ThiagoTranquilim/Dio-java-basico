public class Operadores {
    public static void main(String[] args){

        int soma = 10 + 5;
        int subtracao = 10 - 5;
        int multiplicacao = 10 * 5;
        int divisao = 10 / 5;
        int restoDivisao = 10 % 5;

        boolean igual = 10 == 5;
        boolean diferente = 10 != 5;
        boolean maiorQue = 10 > 5;
        boolean menorQue = 10 < 5;
        boolean maiorOuIgualQue = 10 >= 5;
        boolean menorOuIgualQue = 10 <= 5;

        boolean resultadoAnd = true && false;
        boolean resultadoOr = true || false;

        int a = 1;
        int b = 2;
        String resultadoTernario = (a > b) ? "Número 1 é maior" : "Número 2 é maior";
        System.out.print(resultadoTernario);

    }
}
