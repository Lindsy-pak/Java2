package Java1Project;

public class LabelLoofMission {

	public static void main(String[] args) {
		
		//n1, n2 값이 8이 되면 모든 for문 종료
		//n1, n2 값이 같아지면 n1값을 올린다. 
		
		OUTER:
		for(int n1=1; n1<=9; n1++) {
			for(int n2=0; n2<=9; n2++) {
				if(n1 == n2 && n2 == 8)/* (n1 == 8 && n2 == 8)*/ {
					break OUTER;
				} else if(n1 == n2) { /*if의 조건식과 else if의 조건식 순서가 중요하다. */
					System.out.println();
					continue OUTER;
				} 
				System.out.printf("%d%d\n", n1, n2);
				
			}
			System.out.println();
		}
		System.out.println("끝");

		
		
		
		
	}
}
