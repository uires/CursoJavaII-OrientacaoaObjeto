public class TestaClasses {
	public static void main(String[] args) {
		interfaces a = new Retangulo(3, 2);
		System.out.println(a.calculaArea());
		
		interfaces b = new Circulo(3.14);
		System.out.println(b.calculaArea()	);

	}

}
