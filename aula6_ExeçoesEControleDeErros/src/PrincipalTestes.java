public class PrincipalTestes {
	public static void main(String[] args) {
		System.out.println("Ínicio do teste Main: ");
		m1();
		System.out.println("Fim do teste Main --");

	}

	private static void m1() {
		System.out.println("Método nº -1");
		m2();
	}

	private static void m2() {
		System.out.println("Método nº -2");
		int[] nums = new int[5];
		for(int i = 0; i < nums.length;i++){
			nums[i] = i;
			System.out.println("JJ- " + nums[i] * 2);
			
			
		}
		
		
		
		mF();
		
	}		
		
	
	private static void mF() {
		System.out.println("Método FINAL !");
		
	}

}
