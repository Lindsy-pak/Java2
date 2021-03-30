package Java1Project;

public class SwitchMission2 {

	public static void main(String[] args) {
		String pos ="과장";
		
		// pos 값이 "부장"이면 "700만원"
		// pos 값이 "과장"이면 "500만원"
		// 나머지 pos 값은 "300만원"
		
		switch(pos) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}
		
		int season = (int)(Math.random() * 12) + 1; 
		/* *10을하면 여기서 -1뺸 숫자까지가 범위, 그래서 10까지 범위를 지정하려면 뒤에 1을 더해준다. */ 
		/* 연습문제 49에서 60까지의 숫자 생각해 보기*/
		// 1~12 범위 값만 나오게 처리
		// 3~5 봄
		// 6~8 여름
		// 9~11 가을
		// 12~2 겨울
		System.out.println("season : " + season);
		
		switch(season) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default: /* 범위가 1~12값만 있을 때 디폴드 아닌경우는 case */
			System.out.println("겨울");
			break;
		}
		
		
		
		
		
		

	}

}
