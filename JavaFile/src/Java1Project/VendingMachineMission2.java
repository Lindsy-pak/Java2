package Java1Project;

import java.util.Scanner;

public class VendingMachineMission2 {

	public static void main(String[] args) {
		/*
		 * 아래는 콘솔에 출력해야 하는 내용입니다.
		 * 
		 * <메뉴> 0. 종료 1. 콜라 (1,000원) 2. 사이다 (1,200원) 3. 환타 (1,300원) 선택> 1 콜라를 선택 하셨습니다.
		 * 
		 * 선택> 0 종료 - 사용한 금액은 : 2,300원
		 */

		Scanner scan = new Scanner(System.in);

		String[] menuNmArr = { "콜라", "사이다", "환타" };
		int[] menuPriceArr = { 1000, 1200, 1300 };
		int balance = 0;

		while (true) {
			System.out.println("<메뉴>");

			for (int i = 0; i < menuPriceArr.length; i++) {
				System.out.printf("%d. %s (%,d원)\n", (i + 1), menuNmArr[i], menuPriceArr[i]);
			}
			System.out.print("선택 > ");
			int choice = scan.nextInt();

			if (choice == 0) {
				System.out.printf("종료 - 사용한 금액은 : %,d", balance);
				break;
			} else if (choice >= 1 && choice <= menuPriceArr.length) {
				System.out.printf("%s를 선택 하셨습니다.\n", menuNmArr[choice - 1]);
				balance = balance + menuPriceArr[choice - 1];
			} else {
				System.out.println("잘 못 선택하셨습니다.");
			}
		}
		System.out.println("\n종료!");
		scan.close();

		
		
		
//		int balance = 0;
//		while(true) {
//			System.out.print("선택 > ");
//			int choice = scan.nextInt();
//			if (choice == 0) {
//				break;
//			} else if (choice < 0 || choice > menuPriceArr.length) {
//				System.out.println("잘 못 선택하셨습니다.");
//				continue;
//			}
//			int selectedIdx = choice -1;

//			System.out.printf("%s를 선택 하셨습니다.\n", menuNmArr[selectedIdx]);
//			balance += menuPriceArr[selectedIdx];
//		}
//		System.out.printf("종료 - 사용한 금액은 : %,d", balance);



	}
}
