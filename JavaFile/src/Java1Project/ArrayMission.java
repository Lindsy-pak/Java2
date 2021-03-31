package Java1Project;

public class ArrayMission {

	public static void main(String[] args) {
		//정수형 배열 생성(10칸 짜리)
		//모든 방에 정수값 20을 세팅(for문 활용)
		
		int[] intArr = new int[10];
		
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = 10; 
//			System.out.printf("intArr[%d] : %d\n", i, intArr[i]); -> 출력은 따로 해주는 것이 좋다.  
		}
		
		for(int i=0; i<intArr.length; i++) {
			System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
		}

		
		

		
		
	}
}
