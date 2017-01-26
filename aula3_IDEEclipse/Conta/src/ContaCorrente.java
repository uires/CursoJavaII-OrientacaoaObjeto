public class ContaCorrente extends Conta {

	public ContaCorrente(double saldo, String nome) {
		super(saldo, nome);
	}

	public void atualiza() {

		super.saldo += this.saldo * 0.4;

	}
}
