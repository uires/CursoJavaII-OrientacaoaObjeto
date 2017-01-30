public class PrincipalTestes {
	public static void main(String[] args) {
		System.out.println("Ínicio do teste Main: ");
		try {
			m1();
		} catch (Exception e) {	
			System.out.println("Problema  - -" + e);
		}	
		System.out.println("Fim do teste Main --");

	}

	private static void m1() {
		System.out.println("Método nº -1");
		m2();
		System.out.println("Fim método nº -1");
	}

	private static void m2() {
		System.out.println("Método nº -2");
		int[] nums = new int[5];
		for (int i = 0; i < 6; i++) {
			nums[i] = i;
			System.out.println("JJ- " + nums[i] * 2);
		}
		mF();
		System.out.println("Fim do método nº -2");
	}

	private static void mF() {
		System.out.println("Método FINAL !");

	}

}
