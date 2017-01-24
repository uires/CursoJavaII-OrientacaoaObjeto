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


class ContaPoupanca extends Conta{

	public void atualiza(double taxa){

		this.saldo = this.saldo + ((this.saldo * taxa)* 2);

	}

}

class AtualizadorDeContas extends Conta{

	

}







class Programa{
	public static void main (String[] args){
		

		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

        c.deposita(1000); 
        cc.deposita(1000); 
        cp.deposita(1000);

        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());








	}
}