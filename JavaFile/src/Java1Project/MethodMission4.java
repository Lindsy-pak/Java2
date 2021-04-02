package Java1Project;

public class MethodMission4 {

	public static void main(String[] args) {
		int rNum = getRandomNum(/* 여기가 비어있으면 메소드()에도 비워준다.*/); //0~9
		System.out.println("rNum : " + rNum);
		
		/* 오버로딩 : 똑같은 이름의 메서드를 만들 수 있다. */
		 
		int a = 20;
		rNum = getRandomNum(a); // 0~19
		System.out.println("rNum : " + rNum);
		rNum = getRandomNum(5); // 0~4
		System.out.println("rNum : " + rNum);
		
		rNum = getRandomNum(5, 10); //5~10
		System.out.println("rNum : " + rNum);
		rNum = getRandomNum(10, 20); //10~20
		System.out.println("rNum : " + rNum);

	}
	//1
	public static int getRandomNum() {
		int num = (int)(Math.random()/* 랜덤값은 0.9999999값이다. */*10);
		return num;
		/* return (int)(Math.random()*10);*/
	}
	//2
	public static int getRandomNum(int max/* 매개변수 */) {
		return (int)(Math.random()*max);
	}
	//3
	public static int getRandomNum(int min, int max) {
		return (int)(Math.random()*(max-min)+1 + min);
//		return (int)(Math.random()*(max+min)-1 + min);
		/* 랜덤값 구하는 공식 2가지 : 최댓값 + 최솟값 -1 // 최솟값 - 최댓값 +1 */
	}
	
	
}
