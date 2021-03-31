package Java1Project;

import java.util.Scanner; /* 스캐너에 빨간줄이 뜰 경유 import가 잘 되었는지 확인 : ctrl + shift + o (자동 import) */

public class WhileKeyControlWithScannerExamTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int speed = 0;

		while(true) { /* true(무한루프)를 사용하면 무조건 break가 있어야한다.*/
			System.out.println("---------------------"); /* while문 밖에 있으면 한번만 실행, 안에 있으면 매번 실행 */
			System.out.println("1.증속 | 2.감속 | 3. 중지");
			System.out.println("---------------------");
			System.out.print("선택 : ");
			int inputVal = scan.nextInt();
			
			if (inputVal == 1) {
				speed++;
			} else if (inputVal == 2) {
				speed--;
			} else if (inputVal == 3) {
				/* 스피드를 0으로 만들고 싶으면 브레이크 전에 speed = 0;으로 다시 초기화 해주면 된다. */ 
				break; /* 브레이크는 반복문을 끝내고 반복문 뒤에 명령어를 실행 한다. */
			} else {
				System.out.println("1, 2, 3번만 입력 해 주세요.");
				continue; /* 컨티뉴를 ㅁ나나면 다시 선택 창으로 돌아간다. */
			}
			System.out.println("현재 속도 : " + speed);
		}
		System.out.println("마지막 속도 : " + speed); /* 스피드 값은 계속해서 살아있다. */
		System.out.println("끝!");
		scan.close(); /* 스캐너를 시작했으면 무조건 다시 닫아줘야한다. 아니면 오류가 날 수 있음. */
		
		
		
		
		
		
		
		
		

		
		
		
		
	}
}
