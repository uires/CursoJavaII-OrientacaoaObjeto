class EmpregadoDaFaculdade{

	protected String nome;
	protected double salario;

	public double getGastos(){


		return this.salario;

	}


	public double getSalario(){

		return this.salario;

	}

	public String getInfo(){

		return "nome = "  + this.nome + " com Salário R$ " + this.salario;
	}





}

class Professor extends EmpregadoDaFaculdade{

	private int horaGasto;


	public double getGastos() {

         return this.getSalario()  + this.horaGasto * 10;

    }	

    public String getInfo(){

    	String informacaoBasica = super.getInfo();
    	String informacao = informacaoBasica + " horas de aula gastadas" + this.horaGasto;


    		return informacao;

	
	}
}



class Programa{
	public static void main (String[] args){
			





	}
}