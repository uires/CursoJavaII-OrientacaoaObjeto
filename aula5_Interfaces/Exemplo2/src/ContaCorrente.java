public class ContaCorrente extends Conta implements Tributavel {

	public double calculoTributo() {

		return this.getSaldo() * 0.01;
	}

	
}
