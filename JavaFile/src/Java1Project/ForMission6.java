package Java1Project;

public class ForMission6 {

	public static void main(String[] args) {

		// 3~7 사이 랜덤값

		int star = (int) (Math.random() * 5 + 3);

		// star = 3; (3칸짜리 별이 3줄)

		for (int i = 0; i < star; i++) {
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		//-----------------------------------
		
		for (int i = 1; i <= star; i++) {
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
