package Java1Project;

public class ForExam2 {

	public static void main(String[] args) {
		
		// 중첩 for문 
		
//		for(int i=0; i<5; i++) {
//			for(int z=0; z<5; z++) {
//				System.out.printf("%d - %d\n", i, z);
//			}
//		}
		
		// 2~9단 구구단 출력 !
		
		for(int i=2; i<10; i++) {
//			System.out.println();
			for(int j=1; j<10; j++) {
				int result = j * i; 
				System.out.printf("%d * %d = %d\n", i, j, result);
			}
			System.out.println();
		}
		// 안에 있는 for문이 더 빨리 돈다. 시간을 생각하면 시간보다 분이 더 빨리 돌기 때문
		
		

		
		
		
		
		
		
		
	}
}
