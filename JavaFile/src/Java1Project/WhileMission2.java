package Java1Project;

public class WhileMission2 {

	public static void main(String[] args) {
		
		// 0이 아니면 계속 sum에 더하라 (0나올 때까지 반복문을 돌리시오.)
		//sum : 지금까지 더한 값 출력
		
		int sum = 0;
		int val = (int)(Math.random()* 11); // 0~10사이 랜덤값이 나오도록 함.
		System.out.println("val : " + val);
		
		while(val != 0) { 
			sum = sum + val;
			val = (int)(Math.random()* 11);
			System.out.println("val : " + val);
			}
		System.out.println("sum : " + sum);
		
		
		
		//방법 2
		
		
//		int sum = 0;
//		
//		while(true) {
//			int val = (int)(Math.random()* 11);
//			System.out.println("val : " + val);
//			if(val == 0) {
//				break;
//			}
//			sum += val;
//		}
//		System.out.println("sum : " + sum);

		
			
			
			
			

			
			
			
			
			
			
			
			
			
	}
}
