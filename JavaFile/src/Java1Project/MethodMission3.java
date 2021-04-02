package Java1Project;

public class MethodMission3 {

	public static void main(String[] args) {

//		sumAllFromTo(5, 10); // 5에서부터 10까지의 합 구하기
//		sumAllFromTo(2, 4);
//		sumAllFromTo(1, 100);
//		sumAllFromTo(4, 2);
		sumAllFromTo2(1, 100);
		sumAllFromTo2(4, 2);

//		System.out.println(5+6+7+8+9+10); // sum : 45

	}

//	public static void sumAllFromTo(final int n1, int n2) { /* 파라미터값을 final로 안바꿔주는것이 좋다 그러면 퍼포먼스가 좋아진다. */
//		int sum = 0; /* n1을 변수로 여기서 선언하여 변수명으로 다시 사용하는 것이 좋다. */
//		for(int i=n1; i<=n2; i++) {
//			sum += i; 
//		}
//		System.out.println("sum : " + sum);
//	}
//	public static void sumAllFromTo(int n1, int n2) {
//		int sum = 0;
//
//		if (n1 > n2) {
//			int temp = n1;
//			n1 = n2;
//			n2 = temp;
//		}
//
//		for (int i = n1; i <= n2; i++) {
//			sum += i;
//		}
//		System.out.println("sum : " + sum);
//	}	
//		int sum = (n2 * (n2+1) / 2) - ((n1-1)* n1 / 2);
		/* (1 ~ n)수열의 합을 구하는 공식 : n(n+1) / 2 */
		/*
		 * 1 ~ n1 ~ n2 에서 수열의 합을 구하는 공식은 무조건 1부터 시작이기 때문에 만약에 n1부터 n2까지 구하는 합을 구하기 위해서는
		 * 일단은 1부터 n2까지 수열의 합을 구하고 거기서 1~n1까지 수열의 합을 빼준다.
		 */
	public static void sumAllFromTo2(int n1, int n2) {
		int sum = 0;
		for (int i = n1; i <= n2; i++) {
			sum += i;
		}
		for (int i = n1; i >= n2; i--) {
			sum += i;
		}
		System.out.println("sum : " + sum);
	}

}
