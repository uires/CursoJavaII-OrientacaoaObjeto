public class Circulo implements interfaces {
	private double raio;
	
	public Circulo(double raio){
		// O raio é 3.14 valor de PI;
		this.raio  = raio;
	}

	public double calculaArea() {
	
		return this.raio * 2;
	}
}
