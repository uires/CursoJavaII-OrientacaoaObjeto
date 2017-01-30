public class ContaCorrente extends Conta implements Tributavel {

	public double calculoTributo() {

		return this.getSaldo() * 0.01;
	}

	public void deposita(double d) {
	
		this.saldo += d;
		
	}

	
}
