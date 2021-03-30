package Java1Project;

public class SwitchExam2 {

	public static void main(String[] args) {
		String habbit = "수영";
		
		switch(habbit) {
		case "수영": case "등산":
			System.out.println("건강한 취미입니다.");
			break;
		case "술": case "담배":
			System.out.println("비건전한 취미입니다.");
			break;
		} /* 문자열에서는 equals를 써야하므로 문자열 비교할 때는 switch로 하는 것이 편하다 
		범위를 할 때는 if문이 더 편하다. */

	}

}
