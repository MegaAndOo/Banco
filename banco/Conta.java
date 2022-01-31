package banco;

public abstract class Conta implements iConta {

    protected int agencia;
    protected int numero;
    protected int digito;
    protected double saldo;
    protected Cliente cliente;
    
    private static  final int AGENCIA_PADRAO = 0001;
    private static final int DIGITO_PADRAO = 002;

    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.digito = DIGITO_PADRAO;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }
    @Override
    public void depositar(double valor) {
        saldo += valor;

    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }


    public int getAgencia(){
        return agencia;
    }
    public int getNumero(){
        return numero;
    }
    public int getDigito(){
        return digito;
    }
    public double getSaldo(){
        return saldo;
    }

    protected void imprimirInfosComuns() {
    	System.out.println(String.format (" Cliente: %s", this.cliente.getNome()));
    	System.out.println(String.format (" Agencia: %d", this.agencia));
        System.out.println(String.format (" Conta: %d", this.numero));
        System.out.println(String.format (" Digito %d", this.digito));
        System.out.println(String.format (" Saldo: %.2f", this.saldo));
    }

}
