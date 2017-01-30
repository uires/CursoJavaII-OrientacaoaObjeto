

public class Conta{
	private String nome;
	private double saldo;
	private int agencia;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void deposita(double saldo) {
		this.saldo += saldo;
		System.out.println("Depositov efetuado: -- R$" + this.saldo);	
	}

}
