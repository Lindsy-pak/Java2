package Java1Project;

public class ForMission5 {

	public static void main(String[] args) {
		// 2*1=2 3*1=3 4*1=4 ... 한줄에 나타나게 함 
		// 2*2=4 3*2=6 ...

		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				int result = i * j;
				System.out.printf("%d * %d = %d\t", j, i, result);
			}
			System.out.println();
		}
		
//		for문 안에가 먼저 변하기 때문에 안을 2 , 3, 4, ... 9로 먼저 설정(i)해주고 바깥 for문을 뒤에 변하는 수(j)로 지정해 준다.

		
		
		
		
		
		
		
		
	}
}
