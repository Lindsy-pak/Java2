package Java1Project;

public class MethodExam3 {

	public static void main(String[] args) {
		int mon = 10;
		printSeason(mon);

	}
	public static void printSeason(int mon) {
		switch(mon) {
		case 3: case 4: case 5:
			System.out.println("봄");
			return; /* 메소드에서는 return이 break와 같은 종료의 개념으로 호출된 곳으로 돌아가는 것. */
		case 6: case 7: case 8:
			System.out.println("여름");
			return;
		case 9: case 10: case 11:
			System.out.println("가을");
			return;
		case 12: case 1: case 2:
			System.out.println("겨울");
			return; /* break를 하지않으면 다 출력이 된다. switch는 무조건 break와 같이 쓴다. */
		}
		System.out.println("잘 못 입력하셨습니다.");
	}

}
