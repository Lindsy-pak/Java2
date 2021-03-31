package Java1Project;

public class WhileExam3 {

	public static void main(String[] args) {
		
		int val = 0, sum = 0;
		do {
			val = (int)(Math.random()* 11);
			System.out.println("val : " + val);
			sum += val;
		} while(val != 0);
		
		System.out.println("dowhile-sum : " + sum);
		
		/* while 문은 일단 처음에 val != 0인지 물어보고 시작을 하는데 do while문은 do문이 실행이 되고 나서 while문 실행 
		 * 하지만 do while문은 스코프 문제로 밖에다 val와 sum을 선언해줘야하기 한다. */ 
		

		

		
		
		
		
	}
}
