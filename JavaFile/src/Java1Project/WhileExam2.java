package Java1Project;

public class WhileExam2 {

	public static void main(String[] args) {
		
		int i =0;
		while(true) {
			i++;
			if(i == 10) {
				break;
			}
			if(i % 2 == 0) { //짝수 일 때 
				continue;
			}
			System.out.println("i : " + i);
		}
		System.out.println("끝");
		
		
		for(int k=0; k<10; k++) {
			if(k % 2 == 0) { //짝수 일 때 
				continue;
			}
			System.out.println("k : " + k);
		}
		
		

		
		
		
		
	}
}
