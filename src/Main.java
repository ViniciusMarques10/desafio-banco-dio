public class Main {

	public static void main(String[] args) {
		Cliente Vinicius = new Cliente();
		Vinicius.setNome("Vinicius");
		
		Conta cc = new ContaCorrente(Vinicius);
		Conta poupanca = new ContaPoupanca(Vinicius);

		cc.depositar(900);
		cc.transferir(700, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}