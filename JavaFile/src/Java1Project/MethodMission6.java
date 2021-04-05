package Java1Project;

public class MethodMission6 {

	public static void main(String[] args) {
//		int score = getRandomScore(50, 100);
		int score = 93;
		// 50~100 사이의 랜덤숫자가 나오도록 세팅

		char grade = getGrade(score);
		// 90점 이상'A'
		// 80점 이상'B'
		// 70점 이상'C'
		// 60점 이상'D'
		// 나머지 'E'
		char grade2 = getGrade2(score);
		// ?7이상이거나 100점이면 '+'
		// ?3이하이면 '-'
		// 나머지는 ' '빈칸이 리턴되도록

		System.out.printf("%d :  %c%c\n", score, grade, grade2);

	}

	public static int getRandomScore(int n1, int n2) {
		return (int) (Math.random() * (n2 - n1 + 1) + n1);
	}

	public static char getGrade(int num) {
		if (num >= 90) {
			return ('A');
		} else if (num >= 80) {
			return ('B');
		} else if (num >= 70) {
			return ('C');
		} else if (num >= 60) {
			return ('D');
		}
		return ('E');
		/* 
		 if (score > 0 || score <= 100) {
		 	switch(score / 10) {
		 	case 10: case 9: return 'A';
		 	case 8: return 'B';
		 	case 7: return 'C';
		 	case 6: return 'D';
		 	} 
		 	return 'E';
		 }
		*/
		
	}

	public static char getGrade2(int num) {
		char grade2 = ' ';
		if (num < 60) {
			return grade2;
		}

		int result = num % 10;
		if (result >= 8 || num == 100) {
			return ('+');
		} else if (result <= 3) {
			return ('-');
		}
		return (' ');
	}
	/*
	 int mod = score % 10;
	 if(score == 100; || mod >= 8) {
	 	return '+';
	 } else if (mod <= 3) {
	 	return '-';
	 } 
	 retrun ' ';
	 */
	

}
