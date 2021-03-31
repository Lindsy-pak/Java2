package Java1Project;

public class ArrayExam {

	public static void main(String[] args) {
		// 배열 (같은 타입!!!!!의 변수를 여러개 사용하기 편하기위해 사용하는 것)
		
		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n50000; //저장하고 싶은 숫자가 너무 많아지면 사용함
		
		int[] intArr = new int[10]; /* for문과 잘 사용한다.  */
		intArr[0] = 11; /* 배열은 0부터 시작한다. */
		intArr[1] = 12;
		intArr[9] = 13; /* 0부터 시작했기 때문에 10은 포함하지 않는다. */
//		intArr[19] = 13; 
//		intArr[3] =intArr[19] + 4; /* 값을 주지않으면 각 방 안에는 0이다. */
		/* double[] intArr = new double[500] -> String, boolean도 가능하다. */
		
		//변수 크게 분류 (원시형<primitive type>, 참조형<Reference Type>)
		//byte, short, int, long, boolean, char, float, double ->원시형 []를 쓰는 순간 참조형이 된다. 
		//대문자로 시작하면 참조형 (참조형타입은 수를 안넣어주면 각방에 null이 들어가 있다) 
		//정수형은 따로 수를 지정하지 않으면 0이 들어가 있다. 
//		int len = 100; 
//		int[] intArr = new int[len]; /* 변수로 넣어도 가능 []참조형 */
		String[] strArr = new String[10];
		
		System.out.println("-----------------------------------------");
		int[] intArr2 = {10, 20, 30}; /* 초기화하면서 배열을 사용하는 방법 0번 방에 10들어가고 1번방에 20, 2번방에 30이 들어간다. */
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("intArr2[%d] : %d\n", i, intArr2[i]);
		}
		
		System.out.println(intArr2); //참조변수라서 참조변수의 주소값을 들고오는것임 
		

		 
		

		
		
		
		
		
		
		
		
		
		
	}
}
