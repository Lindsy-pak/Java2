package Java1Project;

public class MethodMission5 {

	public static void main(String[] args) {
		// 중복된 소스 최대한 제거
		// 메소드를 재활용한다!!

		int star = 5;
//		printStarLine(star); // *****
//		System.out.println();
//		star = 3;
//		printStarLine(star); 

//		printStarSqure(star);
		//*****
		//*****
		//*****
		
		star=3;
		printStarTri(star);
		//*
		//**
		//***
	}

	public static void printStarLine(int num) { /* 여기서 int타입은 형변환을 할 수 없다. */
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
	}

	public static void printStarSqure(int num) { /* 메소드는 호출될 때 생성하고 출력일을 하고 다시 데이터를 삭제한다. */
		for (int j = 0; j < num; j++) {
			printStarLine(num);
			System.out.println();
		}
	}
	public static void printStarTri(int num) {
		for (int z=1; z <= num; z++) { //줄 반복
			printStarLine(z); // 한줄안에 별 갯수 반복인데 사용할 수 있는 점점 증가하는 변수는 z이므로 z사용 
			// 다른 변수를 선언(int k=0;)해서 printStarLine(k++);을 넣어줘도 되지만 증가하는 수 z가 있으므로 z를 사용해 준다.  
			System.out.println();
		}
	}

}
