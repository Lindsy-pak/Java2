package Java1Project;

import java.util.Scanner;

public class MethodMission7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;
		// 남자 평균키 : 175, 여자 평균키 : 163

		do {
			System.out.print("성별 : ");
			String gender = scan.next(); // 성별은 남, 여만 받도록

			System.out.print("키 : ");
			int height = scan.nextInt();

			String result = chk(gender, height);
			System.out.println(result);
			// 성별 : 남, 키 : 170cm, 평균 미만
			// 성별 : 여, 키 : 163cm, 평균

			System.out.println("계속 하시겠습니까? (y, n) : ");
			answer = scan.next();
		} while (answer.equals("y"));
		System.out.println("끝");
		scan.close();
	}

	public static String chk(String gender, int height) {
		String result = "평균";
		int stand = 163;
		
		switch(gender) {
		case "남": case "남자":
			stand = 175;
			break;
		case "여": case "woman":
			stand = 163;
			break;
		default:
			return "잘 못 입력하셨습니다.";
		}
		if(height > stand) {
			result = "평균 초과";
		} else if(height < stand) {
			result = "평균 미만";
		}

//		return "성별 : " + gender + ", 키 : " + height + "cm, " + result; -> 문자열을 만드는게 목적이고 printf는 콘솔에 찍히기 위해서 
		return String.format("성별: %s, 키: %dcm, %s", gender, height, result);
		/* 프린트 출력 하는 거는 메소드라서 여기서 사용 할수 없고 void에서만 사용가능하다. */

		
//		int stand = 175;
//		String result ="평균";
//		if(gender.equals("여")) {
//			stand = 163;
//		} else if(!gender.equals("여") || !gender.equals("남")) {
//			return "측정불가\n";
//		}
//		
//		if(height > stand) {
//			result += "초과";
//		} else if(height < stand ) {
//			result += "미만";
//		}
//		return "성별 : " + gender + ", 키 : " + height + "cm, " + result;
	}

}
