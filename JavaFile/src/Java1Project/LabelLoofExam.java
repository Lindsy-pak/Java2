package Java1Project;

public class LabelLoofExam {

	public static void main(String[] args) {
		
		OUTER:/* 레이블링 :이름을 준다. 꼭 OUTER가 아니더라도 상관 없음 */
		for(int i=0; i<3; i++) { /* 중첩 for문에서는 밖에 for은 break 할수 없다. 하지만 레이블링을 사용해서 가능하다. */
			
			INNER: /* 부모가 break가 되면 자식도 다 사라진다.  */
			for(int z=100; z<105; z++) {
				System.out.printf("%d -%d \n", i, z);
				
				if(z == 103) {
					/*continue도 가능 */break OUTER; /* while문과 for 반복문에서만 break와 continue를 사용가능*/
					/* 컨티뉴&브레이크는 다시 위로 올라가거나 break되기 때문에 ddd가 찍히지 않는다. */
				}
			}
			System.out.println("ddd");
		}
		System.out.println("끝!");

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
