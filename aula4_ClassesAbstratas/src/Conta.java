abstract class Conta {

	protected double saldo;
	protected String nome;

	public void saca(double valorASacar) {

		this.saldo -= valorASacar;

	}

	//public abstract void atualiza(double taxa);

	public abstract double getBonus();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposita(double valor) {

		this.saldo += valor;

	}

	public double getSaldo() {

		return this.saldo;
	}

	public void imprime() {

		System.out.println(getBonus());
		System.out.println(this.getNome());

	}

}