
public class Main {

	public static void main(String[] args) {
		Cliente filipe = new Cliente ();
		filipe.setNome("Filipe");
		
		Conta cc = new ContaCorrente(filipe);
		cc.depositar(100);
		cc.sacar(10);
		
		Conta poupanca = new ContaPoupanca(filipe);
		
		cc.transferir(45, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
