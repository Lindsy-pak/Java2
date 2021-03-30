package Java1Project;

public class ForMission7 {

	public static void main(String[] args) {
		// star = 4;
		// *
		// **
		// ***
		// ****

		int star = (int) (Math.random() * 5 + 3); // 3~ 7랜덤 값
		System.out.println("star = " + star);

		for (int i = 1; i <= star; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		
		for(int i=0; i<star; i++) {
			for(int j=0; j<star; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i <= star; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
			
			
		System.out.println("--------------------------------");
		for (int i = star; i > 0; i--) {
			for (int j = i; j > 0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = star; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < star; i++) {
			for (int j = i; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		


		
		
		
		
		
		

	}
}
