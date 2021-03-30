package Java1Project;

public class IfExam3 {

	public static void main(String[] args) {

		// 여자 평균키 : 163
		// 남자 평균키 : 175
		String gender = "여"; // "여";
		int height = 165;

		if (gender.equals("남")) {
			if (height < 175) {
				System.out.println(gender + " " + height + " > " + "평균미만");
			} else if (height == 175) {
				System.out.println(gender + " " + height + " > " + "평균");
			} else {
				System.out.println(gender + " " + height + " > " + "평균초과");
			}
		} else if (gender.equals("여")) {
			if (height < 163) {
				System.out.println(gender + " " + height + " > " + "평균미만");
			} else if (height == 163) {
				System.out.println(gender + " " + height + " > " + "평균");
			} else {
				System.out.println(gender + " " + height + " > " + "평균초과");
			}
		} else {
			System.out.println("다시 입력 해 주세요.");
		}
		
	}
}
