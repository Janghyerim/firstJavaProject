
public class FuncStatic {
	int iv;
	static int cv;
	
	//멤버메소드 : 인스턴스 메소드
	//         -인스턴스변수,클래스변수 모두 사용가능
	//         -인스턴스메소드,클래스메소드 모두 사용가능
	
	//         클래스(static)메소드
	//         -객체 생성없이 사용가능
	//         -클래스변수,클래스메소드만 사용가능
	
	void instanceMethod() {
		System.out.println("instanceMethod() call");
		iv = 10;
		cv = 20;  //객체생성 이전에 출력이 되므로 에러가 안난다.
		
		System.out.println("iv = "+iv);
		System.out.println("cv = "+cv);
		
		staticMethod();
		
		
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() call");
		// iv = 30;  //인스턴스 변수 사용 불가
		              //인스턴스 변수에 인스턴스 메소드는 동일하여 에러가 안나나, 
		              //스태틱 메소드에 인스턴스변수를 쓰게되면 메모리 할당이 안되어 에러가난다. 
		cv = 40;
		
		System.out.println("cv = "+cv);
		
		//instanceMethod();  //생성시점이 다르기 때문에 인스턴스 메소드 사용 불가
		
	}
	

}
