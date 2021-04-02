package Java1Project;

public class MethodExam {

	public static void main(String[] args) { // 메인 메소드
		
		//void : 리턴 타입
		//main : 메소드 이름
		//(String[] args) : 파라미터 매개변수
		//스코프의 범위 { }
		int aaa = 10;
		int result = sum(aaa, 80/* 항상 값을 보내야함 int n1 = 10 -> x */)/* 메소드의 호출부 */;
		System.out.println("sum - result : " + result);
		
		result = minus(20,10);
		System.out.println("minus - result : " + result);
		
		
		
	}
	public static int sum(int n1, int n2/* 메소드의 선언부 */) {
		/* 메소드의 구현부 */ return n1 + n2; /* 나를 호출한 곳으로 이동 return */
		/* 메소드 안에 메소드는 만들수 없다. 메소드는 다 같은 형제 메소드는 씨언어에서는 함수와 같은 개념 */
		/* 메소드를 정의하는 부분 퍼블릭부터 괄호까지  */
	}
	public static int minus(int n3, int n4) {
		return n3 - n4;
	}
}
