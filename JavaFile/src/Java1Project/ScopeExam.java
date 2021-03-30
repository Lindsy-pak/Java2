package Java1Project;

public class ScopeExam {
	
	int b = 10; // 전역변수

	public static void main(String[] args) {
		//스코프 (변수&상수가 살아있는 범위)
		
		int a = 10; // 지역변수 
		
		int jjj2 = 10; // jjj(2)
		if(a > 9) {
			System.out.println("a : " + a);
			int jjj1 = 10; // jjj(1)
			System.out.println("jjj(1) : " + jjj1);
		}
		System.out.println("jjj(2) : " + jjj2); 

		
		
		
		
		
		
		
		
		
		
	}
}
