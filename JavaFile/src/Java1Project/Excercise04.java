package Java1Project;

public class Excercise04 {

	public static void main(String[] args) {
		
		/*
		 * while문과 Math.random() 메소드를 이용해서 두개의 주사위를 던졌을 때 
		 * 나오는 눈을 (눈1,눈2) 형태로 출력하고, 눈의합이 5가아니면 계속 주사위를 던지고,
		 * 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
		 * 눈의 합이 5가 되는 조합은 (1,4) (4,1) (2,3) (3,2)입니다.
		 * 
		 * 눈값의 범위는 1~6으로 합시다.
		 */
		

//		while(true) {
//			int n1 = (int)(Math.random()*6 +1);
//			int n2 = (int)(Math.random()*6 +1);
//			int sum = n1 + n2;
//			if(sum != 5) {
//				System.out.printf("(%d,%d)\n", n1, n2);
//			} else {
//				break;
//			}
//		}
//		System.out.println();
//		System.out.println("끝!");
		
		// 5가 되면 나오게 하는 방법
		
		while(true) {
			int n1 = (int)(Math.random()*6 + 1);
			int n2 = (int)(Math.random()*6 + 1);
			int sum = n1 + n2;
			System.out.printf("(%d,%d)\n", n1, n2); /* 5까지 찍히려면 5일 때도 무조건 출력 명령이 실행되도록 밖에 적으면 된다. */
		
			if(sum == 5) {
				break;
			}
		}
		System.out.println();
		System.out.println("끝!");

		
		
		
		
		
		
		
		
	}
}
