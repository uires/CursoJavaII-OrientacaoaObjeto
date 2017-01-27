public class Principal {
	public static void main(String[] args) {

		Conta conta = new ContaPoupanca();
		conta.setSaldo(3002.5);
		conta.deposita(100.1);
		conta.setNome("Jesus da Silva");		
		conta.imprime();
		conta.setSaldo(500);
		System.out.println(conta.getSaldo());
		
		conta.getBonus();
		System.out.println(conta.getSaldo());
		

	}

}