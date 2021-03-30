package Java1Project;

public class SwithchExam {

	public static void main(String[] args) {
		int val = 2;
		switch(val) { 
		case 1:
		case 4: /* 1와 4는 같이 실행 된다. */ 
			System.out.println("값은 1이다.");
			break;
		case 2:
			System.out.println("값은 2이다.");
			break;
		case 3:
			System.out.println("값은 3이다.");
			break;
		default:
			System.out.println("값은 1~3이 아니다.");
			break; /* 항상 밑에 있을 필요는 없다 break가 모든 case에 있으면 상관없지만 없다면 default의 위치가 영향을 미친다.*/
		}
		System.out.println("끝");
		

	}

}
