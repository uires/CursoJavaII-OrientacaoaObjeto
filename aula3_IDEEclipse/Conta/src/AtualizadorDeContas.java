public class AtualizadorDeContas extends Conta {

	public AtualizadorDeContas(double saldo, String nome) {
		super(saldo, nome);
	}

	private double saldoTotal = 0;
	private double selic;

	public void getSelic(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println("================= ");
		System.out.println("Saldo anterior: R$ " + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo atualizado: R$ " + c.getSaldo());

		this.saldoTotal += c.getSaldo();

	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}

}
