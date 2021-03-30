package Java1Project;

public class ForMission4 {

	public static void main(String[] args) {
		
		// 2~9까지 랜덤한 값으로 단 출력
		int dan = (int)(Math.random()*8 + 2);
//		
//		for (int i=1; i<10; i++) {
//			int result = dan * i;
//			System.out.printf("%d * %d = %d\n", dan, i, result);
//			System.out.println("-----------------------------");
//			System.out.println(dan + " * " + i + " = " + result + "\n");
//		}
		
		for (int i=6; i<15; i++) {
			int result = dan * (i-5);
			System.out.printf("%d * %d = %d\n", dan, i-5, result);
		}
		
		
	}
}
