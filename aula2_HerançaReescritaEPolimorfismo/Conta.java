class Conta{

	protected double saldo;

	public double getSaldo(){

		return this.saldo;
	}

	public void setSaldo(double valor){

		this.saldo = valor;

	}

	public void deposita(double valorADepositar){

		this.saldo += valorADepositar;

	}

	public void saca(double valorASerSacado){

		this.saldo -= valorASerSacado;
	}

	public void atualiza(double taxa){

		this.saldo = this.saldo + ( this.saldo * taxa);

	}


}


class ContaCorrente extends Conta{

	public void atualiza(double taxa){

		this.saldo = this.saldo + ((this.saldo * taxa)* 3);

	}
	public void deposita(double valorADepositar){

		this.saldo += valorADepositar - 0.10;

	}


}


class ContaPoucanca extends Conta{

	public void atualiza(double taxa){

		this.saldo = this.saldo + ((this.saldo * taxa)* 2);

	}

}








class Programa{
	public static void main (String[] args){

		Conta joao = new Conta();
		joao.setSaldo(3000.0);
		System.out.println("R$ " + joao.getSaldo());	



		joao.atualiza(0.2	);

		System.out.println("R$ " + joao.getSaldo());

		ContaCorrente luiz = new ContaCorrente();

		luiz.setSaldo(3000.0);
		luiz.atualiza(0.2);
		System.out.println(luiz.saldo);









	}
}