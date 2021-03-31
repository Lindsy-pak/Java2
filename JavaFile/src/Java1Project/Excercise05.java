package Java1Project;

public class Excercise05 {

	public static void main(String[] args) {
		/*
		 * 중첩 for문을 이용하여 방정식 4x +5y = 60의 모든 해를 구해서 (x, y)
		 * 형태로 출력 해 보세요.
		 * 단, x와y는 10이하의 자연수입니다. (x,y는 1~10 사이의 값)
		 * (실행결과)
		 * (5, 8)
		 * (10,4)
		 */

		

		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				
				if((i*4) + (j*5) == 60) {
					System.out.printf("(%d,%d)\n", i, j);
					break; /* 값이 정해져 있으면 break를 주는 것이 좋고 답이 정해지지 않으면 break를 안주는 것이 좋다. 
					여기서는 break를 줌으로써 퍼포먼스가 좋아진다. label해서 continue주는 방법도 있음 */
				}
			}
		}
		System.out.println("끝!");
		
		
		
		
		
		
		
	}
}
