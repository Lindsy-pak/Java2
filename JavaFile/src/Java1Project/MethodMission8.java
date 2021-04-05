package Java1Project;

public class MethodMission8 {

	public static void main(String[] args) {
//		gugudan(8);
		//8 * 1 = 8
		//8 * 9 = 72
		
		gugudan(4, 8); //단 바뀔때---- 구분되도록 세팅

	}
	public static void gugudan(int num) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}

	public static void gugudan(int n1, int n2) { /* 변수명은 절대 */
		for (int i=n1; i<=n2; i++) {
			gugudan(i);
			System.out.println();
			System.out.println("--------------\n");
		}
	}
}

