package Java2Project;

public class InstanceExam4 {

	public static void main(String[] args) {
		// Car 객체화 2개
		// 첫번째 차는 name은 "소나타", cc는 2000
		// 두번째 차는 name은 "911", cc는 5000
		// 첫번쨰 차량 drive한다.
		// 첫번째 차량 stop한다.
		
		Car car1 = new Car();
		Car car2 = new Car(); /* 객체화 */
		
		car1 = car2; /* car2의 값을 car1에 넣어준다. 그래서 car1은 덮어씌어진다.  */
		System.out.println(car1 == car2);
		
		car1.name = "소나타";
		car1.cc = 2000;
		
		car2.name = "911";
		car2.cc = 5000;
		
		car1.drive();
		car1.stop();
		
		car2.drive();
		car2.stop();
	}
}

class Car {
	String name;
	int cc;
	
	void drive() { /* 보이드는 달린다를 출력하고 다시 리턴하지 않는다. */
		System.out.printf("%s는 달린다.\n",name);
	}
	
	void stop() {
		System.out.printf("%s는 멈춘다.\n",name);
	}
}
