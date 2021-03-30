package Java1Project;

public class IfExam2 {

	public static void main(String[] args) {
		int score = 81;
		
		if(score >= 90) { // 90 ~
			System.out.println("등급 A");
		} else if(score >= 80) { // 80 ~ 89
			System.out.println("등급 B");
		} else if(score >= 70) { // 70 ~ 79
			System.out.println("등급 C");
		} else { /* else는 옵셥이라서 없어도 됨 */
			System.out.println("등급 D"); /* ~69, -값또한 포함 */
		}
		/* 110을 주어도 성립이 된다. */

	}
}
