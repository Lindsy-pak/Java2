package Java1Project;

public class WhileKeyControlExam {

	public static void main(String[] args) throws Exception /* 예외 처리 */ {
		
		/* java 책 127p 예제문제  */ 
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("---------------------");
				System.out.println("1.증속 | 2.감속 | 3. 중지");
				System.out.println("---------------------");
				System.out.printf("선택 : ");
			}
			keyCode = System.in.read();
			System.out.println("\nkeyCode : " + keyCode);
			
			if(keyCode == 49) {
				speed++;
				System.out.println("현재 속도 : " + speed);
			} else if(keyCode == 50) {//키보드의 2번 key
				speed--;
				System.out.println("현재 속도 : " + speed);
			} else if(keyCode == 51) {//키보드의 3번 key
				run = false;
			}
		}
		System.out.println("끝");

		
		
		
		
		
		
		
	}
}
