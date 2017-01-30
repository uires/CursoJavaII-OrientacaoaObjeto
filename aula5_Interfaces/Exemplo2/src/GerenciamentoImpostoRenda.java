public class GerenciamentoImpostoRenda extends Conta{
	private double total;
	
	public void adcionaTributaveis(Tributavel c){
		System.out.println("Direcionando tributos ... ==== " + c);
		
		this.total += c.calculoTributo();
				
	}
	
	public double getTotal(){
		
		return this.total;
	}
	
		

}
	