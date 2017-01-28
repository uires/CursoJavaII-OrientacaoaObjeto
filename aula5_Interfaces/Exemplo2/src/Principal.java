public class Principal {

	public static void main(String[] args) {
		ContaCorrente c = new ContaCorrente();
		c.setSaldo(100.0);
			
		
		System.out.println(c.calculoTributo());
		Tributavel t = c;
		
		System.out.println(t.calculoTributo());
		
	}

}
