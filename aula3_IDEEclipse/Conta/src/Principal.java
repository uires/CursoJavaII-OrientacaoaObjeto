public class Principal {
	public static void main(String[] args) {

		Conta conta = new Conta(4412.1, "João");
		conta.deposita(100.1);
		conta.imprime();

	}

}