public abstract class Conta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero =  SEQUENCIAL++;
    }

    public int getNumero(){
        return numero;
    }

    public int getAgencia(){
        return agencia;
    }

    public double getSaldo(){
        return saldo;
    }

    public void sacar(double valor){
        saldo -= valor;
    }
    public void depositar(double valor){
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns(){
        System.out.println((String.format("Agência: %d", agencia)));
        System.out.println((String.format("Número: %d", numero)));
        System.out.println((String.format("Saldo: %.2f", saldo)));
    }
}
