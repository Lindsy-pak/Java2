package Java1Project;

public class MethodMission2 {

	public static void main(String[] args) {
		int n1 = 10, n2 = 3;
		double result = divide(n1,n2) ;
		System.out.println("result : " + result); //3.333..
		
		result = divide(10, 5);
		System.out.println("result : " + result); //2.0
		
		System.out.println();
		
		System.out.println("절대값 : " + abs(10)); //10
		System.out.println("절대값 : " + abs(-10)); //10
		

	}
	public static double divide(int n1, int n2) {
		
		return (double)n1 / n2; // -> int 타입 변수를 double로 형변환 해 주어야 소수점 자리 수가 나타난다.  
	}
	
	public static int abs(int num) {
		if(num < 0) {
			return num * -1;
		}
		return num;
	}
}
