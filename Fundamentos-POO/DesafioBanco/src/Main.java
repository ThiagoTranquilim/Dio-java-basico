public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.depositar(100);

        cc.transferir(100, cp);

        cc.imprimirExtratos();
        cp.imprimirExtratos();
    }
}
