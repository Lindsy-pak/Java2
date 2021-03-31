package Java1Project;

import java.util.Scanner; 

public class WhileKeyControlWithScannerExam {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int speed = 0;
		System.out.println("-------------------------");
		System.out.println("1.증속 | 2.감소 | 3. 종료");
		System.out.println("-------------------------");

		while(true) {
			System.out.print("선택 : ");
			int inputVal = scan.nextInt();

			if (inputVal == 1) {
				speed++;
			} else if (inputVal == 2) {
				speed--;
			} else if (inputVal == 3) {
				speed = 0;
				break;
			} else {
				System.out.println("1, 2, 3번만 입력 해 주세요.");
				continue;
			}
			System.out.println("현재속도 : " + speed);
		}
		System.out.println("마지막 속도 : " + speed);
		System.out.println("끝");
		scan.close();

	}
}
