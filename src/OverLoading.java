
public class OverLoading {
	//객체 : 상속,다형성,캡슐화(정보은닉)
	//오버로딩 : 메소드는 정의시 사용하는 방법
	//1.메소드의 이름을 동일하게 사용한다.
	//2.단 매개변수의 타입 또는 갯수는 달라야한다.
	//3.리턴타입과는 무관하다.
	//4.객체의 다형성 구현  
	
	int x;
	
	//데이터타입이나 갯수가 다른 예시
	void add () {}
	
	void add(int x) {}
	
	void add(long l) {}
	
	void add(int x,int y) {}
	
	void add(int x,long y) {}
	
	void add(long x,int y) {}
	
	//int add() {}  X

}
