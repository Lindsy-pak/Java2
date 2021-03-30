package Java1Project;

public class IfMission3 {

	public static void main(String[] args) {
//		final int SCORE = (int)(Math.random() * 20) +81;
//		System.out.println("SCORE : " + SCORE);
		//SCORE 값은 81~100점 사이의 값이 된다. (실행할 때마다 달라진다)
		
		//91~100 A (97점 이상은 "A+", 96~94 "A", 93~91 "A-"
		//81~90 B (87점 이상은 "B+", 86~84 "B", 83~81 "B-"
		
		
//		if(SCORE > 96) { 
//			System.out.println("A+");
//		} else if(SCORE > 93) {  
//			System.out.println("A");
//		} else if(SCORE > 90) { 
//			System.out.println("A-");
//		} else if(SCORE > 86) { 
//			System.out.println("B+");
//		} else if(SCORE > 83) {
//			System.out.println("B");
//		} else if(SCORE > 80) {
//		} else { 
//			System.out.println("C");
//		}

		
//		final int SCORE = (int)(Math.random() * 20) +81;
//		System.out.println("SCORE : " + SCORE);
//		
//		String displayGrade = "";
//		int range = SCORE % 10;
//				
//		if(SCORE > 90) {
//			displayGrade = "A";
//		} else if(SCORE > 80) {
//			System.out.print("B");
//		}
//		
//		if(range < 4 && range != 0) {
//			System.out.println("-" + displayGrade);
//		} else if(range < 7 && range != 0) {
//			System.out.println(displayGrade);
//		} else {
//			System.out.println("+" + displayGrade);
//		}
//		
		//91~100 A (97점 이상은 "A+", 96~94 "A", 93~91 "A-"
		//81~90 B (87점 이상은 "B+", 86~84 "B", 83~81 "B-"
		
		System.out.println("--------------------------------------------");
		
//		final int SCORE = (int)(Math.random() * 20) +81;
		
//		int SCORE = 90;
//		System.out.println("SCORE : " + SCORE);
//		
//		char grade ;
//		String sign = "-";
//		int result = SCORE % 10;
//		
//		if(SCORE > 90) {
//			grade = 'A';
//		} else {
//			grade = 'B';
//		}
//		
//		if(result >= 7 || result == 0) {
//			sign = "+";
//		} else if(result > 3) {
//			sign = "";
//		} else {
//			sign = "-";
//		}
//		
//		System.out.printf("%s%c", sign, grade);
		
		System.out.println("--------------------------------------------");
		
		final int SCORE = (int)(Math.random()*41)+60;
		System.out.println("SCORE :"+SCORE);//81~100
		
		/*
		 * 91~100 A ( 97점 이상은 "A+", 96~94 "A", 93~91 "A-"
		 * 81~90 B (87점 이상은 "B+", 86~84 "B", 83~81 "B-" 
		 * 70 포함 D
		 * */
		
		char grade = 'D';
		String sign = "-";
		int result = SCORE % 10;
		
		if(SCORE>90) {
			grade = 'A';
		}else if(SCORE>80) {
			grade = 'B';
		}else if(SCORE>70) {
			grade = 'C';
		}
		
		if(SCORE<=70) {
			sign="";
		}else if(result >=7 || result==0) {
			sign ="+";
		}else if(result>=4) {
			sign ="";
		}
		System.out.printf("%c%s",grade,sign);
		
		
		
		
		
		
	}
}
