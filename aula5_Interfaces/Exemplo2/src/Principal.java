public class Principal {

	public static void main(String[] args) {
		GerenciamentoImpostoRenda gerenciador = new GerenciamentoImpostoRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		
		gerenciador.adcionaTributaveis(sv);
			
		ContaCorrente cc = new ContaCorrente();
		cc.setSaldo(30034.1);
		cc.deposita(1000.1);
		
		gerenciador.adcionaTributaveis(cc);
		
		System.out.printf("O seu saldo é: R$ %.2f",cc.getSaldo());
		
		
	}

}
