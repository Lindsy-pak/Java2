package Java1Project;

import java.util.Scanner;

public class MethodMission10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] menuNmArr = {"콜라", "사이다", "환타", "스트라이트", "망고주스", "포도주스"};
		int[] menuPriceArr = {1000, 1200, 1300, 1500, 2000, 3000};
		
		printMenu(menuNmArr, menuPriceArr);

	}
	public static void printMenu(String[] name, int[] price) {
		String result = "<메뉴>\n";
		for(int i=0; i<name.length; i++) {
//			System.out.printf("%d. %s (%,d원)\n",i+1, name[i], price[i]);
//			result += (i+1) + ". " + name[i] + " (" + price[i] + "원)\n";
			result += String.format("%d. %s (%,d원)\n",i+1, name[i], price[i]);
		}
		System.out.println(result);

	}

}
