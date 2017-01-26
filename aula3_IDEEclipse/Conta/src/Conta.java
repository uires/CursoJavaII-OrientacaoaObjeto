public class Conta {
	// Variáveis ==
	protected double saldo;
	protected String nome;

	public Conta(double saldo, String nome) {
		this.saldo = saldo;
		this.nome = nome;
	}

	public void saca(double valorASacar) {

		this.saldo -= valorASacar;

	}

	public void atualiza(double taxa) {

		this.saldo += this.saldo * taxa;

	}

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

		System.out.println(this.getSaldo());
		System.out.println(this.getNome());

	}

}