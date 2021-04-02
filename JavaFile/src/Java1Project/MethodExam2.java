package Java1Project;

public class MethodExam2 {

	public static void main(String[] args) {
		int n1 = 10, n2 = 30;
		
		voidSum(n1, n2);
		voidSum(1,2); /* void는 무조건 이 형태로 호출한다. 타입(String, int...)을 절대 주지 않는다.  */
		
		System.out.println("----------------");
		
		int result = intSum(n1,n2);
		System.out.println("result-1 : " + result);
		result = intSum(1,2);
		System.out.println("result-2 : " + result);
		
		for(int i=0; i<100; i++) {
			hello(); /* 메소드 자체로는 연산이 불가능 함 100번 호출하고 싶다고 hello()*100 -> 이거는 파이썬만 가능하고 자바에서는 for문 돌려야함 */
		}

	}
	
	public static void voidSum(int n1, int n2) {
		/* void는 리턴하지 않겠다는 의미 :나오는 값이 없다. */
		System.out.printf("%d + %d = %d\n",n1, n2, (n1+n2));
		/* 2차가공이 필요없을 때 보이드를 사용 */
	
	}
	
	public static int intSum(int n1, int n2) {
		return n1 + n2;
		/* 호출 할 때 int만 가능 타입은 타입에 맞게 호출해야한다. */
		
	}
	public static void hello() {
		System.out.println("안녕하세요!");
	}
	
	/*메소드의 타입 4가지
	 * 리턴타입 : void, 비void 
	 * 파라미터 : O, X */

}
