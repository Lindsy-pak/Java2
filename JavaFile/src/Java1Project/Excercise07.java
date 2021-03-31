package Java1Project;

import java.util.Scanner; 

public class Excercise07 {

	public static void main(String[] args) {
		
		boolean run = true; /* run = false를 넣으면 반복문 종료 */
		
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택 : ");
			int option = scan.nextInt();

			if (option == 1) {
				System.out.print("예금액 : ");
				option = scan.nextInt(); /* 예금 금액 */
				balance = balance + option;
			} else if (option == 2) {
				System.out.print("출금액 : ");
				option = scan.nextInt(); /* 출금 금액 */ 
				balance = balance - option;
			} else if (option == 3) {
				System.out.println("잔고 : " + balance); /* 남은 잔고 */
			} else if (option == 4) {
				break;
			} else {
				System.out.println("다시 입력 해 주세요.");
			}
		}
		scan.close();
		System.out.println("\n프로그램 종료");
		
//		--------------------------------------------------------------------
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택 : ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("입금액 > ");
				balance = balance + scan.nextInt();
				//balacne += scan.nextInt();
				break;
			case 2:
				System.out.println("출금액 > ");
				balance = balance - scan.nextInt();
				//balacne -= scan.nextInt();
				break;
			case 3:
				System.out.println("잔고 > " + balance);
				break;
			case 4:
				run = false;
				break;
			default :
				System.out.println("1~4번만 입력해 주세요.");
			}
		}
		scan.close();
		System.out.println("\n프로그램 종료");
		
//		--------------------------------------------------------------------
		
		MAIN:
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택 : ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("입금액 > ");
				balance = balance + scan.nextInt();
				//balacne += scan.nextInt();
				break;
			case 2:
				System.out.println("출금액 > ");
				balance = balance - scan.nextInt();
				//balacne -= scan.nextInt();
				break;
			case 3:
				System.out.println("잔고 > " + balance);
				break;
			case 4:
				break MAIN;
			default :
				System.out.println("1~4번만 입력해 주세요.");
			}
		}
		scan.close();
		System.out.println("\n프로그램 종료");

		
		
		
		
		
		
		
		
		
	}
}
