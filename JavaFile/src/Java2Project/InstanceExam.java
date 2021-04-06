package Java2Project; /* 기본패키지는 .이 두개정도 들어가주어야 한다. */
/* 패키지명 : 웹도메인 com.naver.프로젝트명.model.클래스명 */

public class InstanceExam { /* 클래스명이 파일명과 같아야한다. f2번 누르고 파일면 변경 또는 refactor - rename */

	public static void main(String[] args) {
		/* 프로토 타입 - 자바 스크립트 
		 * 클래스타입 - 자바
		 * 클래스 하나가 객체가 될 수 있는 존재 (이름이 있으면 객체 : 경계가 있으면 객체)
		 * 인스턴스 - 객체화 된 존재 
		 * 참조타입(레퍼런스 타입)은 메모리의 주소값을 참조하여 불러온다  */
		Dog/*Dog type도 가능(사용자 정의 클래스) : 레퍼런스 변수타입 !! */ d1/* 변수 명 */ = new/* 객체화를 시켜주는 키워드 */ Dog();
		/* new Dog(); -> 이렇게만 적으면 한번만 적고 끝나고 위처럼 적으면 계속 존재한다. */ 
//		byte, short, int, long, float, double, char, boolean -> 이외에는 다 참조타입(레퍼런스 타입 : 대문자로 시작하는 특징이 있다.)
//		int aaa = true; -> boolean 과 int 같이 사용 불가!!! 한번 타입을 정하면 계속 그 타입이다.
		Dog d2 = new Dog(); /* 같은 도그의 구조를 가지고 있지만 d1 d2는 다른 주소값 다른 존재이다. 각자 다른 값을 저장 할 수 있다. */
		d1.name = "뽀삐";
		d2.name = "돌쇠";
		
		d1.bark();
		d2.bark();
		/* ddd에는 주소값이 들어있다. new 라는 키워드로 메모리에 올린다 메모리에 올리지 않으면 저장이 되지 않고 객체화가 아닌 그냥 문서가 된다. */
		

	}
}
	//멤버 필드 (값을 저장 할 수 있는 것) - 명사 담당,
	//멤버 메소드 (값을 수정할 수 있는 것) - 동사 담당 
class Dog {
	String name; /* 전역 변수  -> 멤버필드 */
	int age;
	
	void bark() {
//		String name; -> 지역변수
		System.out.printf("%s가 멍멍\n", name);
	}
}


