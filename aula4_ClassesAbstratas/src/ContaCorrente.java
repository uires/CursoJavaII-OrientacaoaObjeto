public class ContaCorrente extends Conta {

	public void atualiza() {

		super.saldo += this.saldo * 0.4;

	}
	
	
	public void cobraEntrega(){
		System.out.println("A entraga já foi feita??????????");
	}


	public double getBonus() {
		return this.saldo;
		
	}


	public void atualiza(double taxa) {
			
	}


	
}
