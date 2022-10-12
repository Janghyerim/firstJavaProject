
public class MemberInit {
	
	//멤버변수
	//초기화 순서 : 자동초기화 -> 명시초기화 -> 초기화 블록 -> 생성자에의한 초기화
	//*static 초기화 블럭은 한번만 동작하고 인스턴스는 생성자 호출보다 먼저 계속 출력된다.*
	
	int x = 10;
	int y;
	static int cv = 100; //->명시초기화
	static int count;
	
	
	{ //인스턴스 초기화 블록(객체가 생성될때마다 호출)
		System.out.println("인스턴스 초기화 블록");
		x = 10;
		y = 20;
	}
	
	static {  //static 초기화 블록(객체생성 시 딱 한번만 호출) 
		System.out.println("static 초기화 블록");
		count = 1000;
	}
	
	MemberInit(int x,int y){ //제일 마지막 호출
		System.out.println("생성자의 호출");
		this.x = x;
		this.y = y;
	}
}
