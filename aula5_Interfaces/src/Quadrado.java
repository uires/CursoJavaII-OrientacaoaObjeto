public class Quadrado implements interfaces {
	private int lado;
	
	public void quadradoCal(int lado){
		this.lado = lado;
	}
	public double calculaArea(){
		return this.lado * this.lado;
	}
}
