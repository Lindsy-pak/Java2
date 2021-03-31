package Java1Project;

public class Excercise03 {

	public static void main(String[] args) {
		/* 자바 책 133p 문제 */
		
		// for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드 작성
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("sum : " + sum);
		
		
		
		
		
		
	}
	
	
}
