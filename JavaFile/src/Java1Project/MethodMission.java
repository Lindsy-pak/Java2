package Java1Project;

public class MethodMission {

	public static void main(String[] args) {
		whoIsBig(10, 30, 100); //콘솔 > 100이 가장 큽니다. 
		
		whoIsBig(10, 9, 3); // 콘솔 > 10이 가장 큽니다. 
		
		whoIsBig(11, 25, 4); // 콘솔 > 25이 가장 큽니다.
		
		System.out.println();
		
		int big = getBigNum(10,30);
		System.out.println("big : " + big); //big : 30
		
		big = getBigNum(10,9);
		System.out.println("big : " + big); //big : 10

	}
	
	public static void whoIsBig(int a, int b, int c ) {  /* void는 return 값이 자동으로 들어간다. void는 타입이 없다.  */
		if(a > b && a > c) {
			System.out.printf("%d이 가장 큽니다.\n",a);
		} else if(b > a && b > c) {
			System.out.printf("%d이 가장 큽니다.\n",b);
		} else {
			System.out.printf("%d이 가장 큽니다.\n",c);
		}
	}
	
//	int big = n1; -> 두개만 비교할 때 알고리즘 
//	if(n1 < n2) {
//		big = n2
//	} 
//	System.out.printf("%d이 가장 큽니다.\n",big);
	
	public static int getBigNum(int n1, int n2) { /* 비void는 return 값을 무조건 줘야한다.  */
		if(n1 > n2) {
			return n1;
		}
		return n2; /* else는 필요없음 if에 들어가지않으면 무조건 else 값임 */

	}
	
	
}
