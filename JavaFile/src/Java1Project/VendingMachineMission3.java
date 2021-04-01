package Java1Project;

import java.util.Scanner;

public class VendingMachineMission3 {

	public static void main(String[] args) {
		/*
		 * 돈을 주입해 주세요 : 3000 <메뉴> 0. 종료 1. 콜라 (1,000원) 2. 사이다 (1,200원) 3. 환타 (1,300원)
		 * 
		 * 선택> 1 콜라를 선택하셨습니다. (남은금액 2,000)
		 * 
		 * 선택> 3 금액이 부족합니다. (남은 금액 7000원)
		 * 
		 * 선택> 0 종료 - 남은금액 : 700원
		 */

		Scanner scan = new Scanner(System.in);
		String[] menuNmArr = { "콜라", "사이다", "환타" };
		int[] menuPriceArr = { 1000, 2000, 3000 };
//		System.out.print("돈을 주입 :");
//		
//		int balance = 0;
//		int putMoney = scan.nextInt();
//		balance += putMoney;
//		
//		System.out.printf("<메뉴>\n");
//		for (int i = 0; i < menuPriceArr.length; i++) {
//			System.out.printf("%d. %s (%,d원)\n", (i + 1), menuNmArr[i], menuPriceArr[i]);
//		}
//		while (true) {
//			System.out.print("선택 > ");
//			int choice = scan.nextInt();
//			int selectedIdx =choice-1;
//			
//			if(choice == 0) {
//				System.out.printf("종료 - 남은금액 : %d\n", balance);
//				break;
//			} else if(choice < 0 || choice > menuPriceArr.length) {
//				System.out.println("잘 못 입력하셨습니다.");
//				continue;
//			} else if(balance < 0 || balance<menuPriceArr[selectedIdx]) {
//				System.out.printf("금액이 부족합니다. (남은금액 %d원)", balance);
//			}else {
//				balance -= menuPriceArr[selectedIdx];
//				System.out.printf("%s를 선택하셨습니다. (남은 금액 %d원)\n",menuNmArr[selectedIdx], balance);
//			}
//			System.out.println();
//		}
//		System.out.println("\n종료!");
//		scan.close();
		
		System.out.println("----------------------------------------");
		System.out.print("돈을 주입 :");
		int balance = scan.nextInt();
		while(true) {
			System.out.print("선택> ");
			int choice = scan.nextInt();
			
			
			if(choice == 0) {
				System.out.printf("종료 - (남은금액 : %d원)",balance);
				break;
			} else if(choice < 0 || choice > menuNmArr.length) {
				System.out.println("잘 못 선택하셨습니다.");
				continue;
			} else {
				int selectedNum = choice - 1;
				if(balance < menuPriceArr[selectedNum]) {
					System.out.printf("돈이 부족합니다. (남은금액 : %d원)\n",balance);
					continue;
				}
				balance -= menuPriceArr[selectedNum];
				System.out.printf("%s를 선택했습니다. (남은금액 : %d원)\n",menuNmArr[selectedNum],balance);
			}
			System.out.println();
		}
		System.out.println("\n종료!");
		scan.close();
		
		System.out.println("----------------------------------------");
		System.out.print("돈을 주입 :");
		int insertMoney = scan.nextInt();
		System.out.println("<메뉴>");
		System.out.println("0.종료");
		for(int i=0; i<menuPriceArr.length; i++) {
			System.out.printf("%d. %s (%,d원)\n", (i + 1), menuNmArr[i], menuPriceArr[i]);
		}
		boolean run = true;
		while(run) {
			System.out.print("선택 >");
			int choice = scan.nextInt();
			if(choice < 0 || choice > menuNmArr.length) {
				System.out.println("잘 못 선택하셨습니다.");
				continue;
			}
			int selectedIdx = choice -1;
			if(choice == 0) {
				run = false;
				System.out.println("종료");
			} else if(insertMoney < menuPriceArr[selectedIdx]) {
				System.out.println("금액이 부족합니다.");
			} else {
				System.out.printf("%s를 선택했습니다.\n",menuNmArr[selectedIdx]);
			}
			System.out.printf("(남은 금액 : %,d원)\n", insertMoney);
		}
		scan.close();
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}
}
