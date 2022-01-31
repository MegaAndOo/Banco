package banco;

public class Main {

    public static void main(String[] args) {
    	
    	Cliente anderson = new Cliente();
    	anderson.setNome("Anderson");
    	Cliente clara = new Cliente();
    	clara.setNome("Clara");
    	
        Conta cc = new ContaCorrente(anderson);
        Conta poupanca = new ContaPoupanca(clara);
        
        
        cc.depositar(100);
        cc.transferir(30, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
