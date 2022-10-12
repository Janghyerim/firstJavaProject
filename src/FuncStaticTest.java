
public class FuncStaticTest {

	public static void main(String[] args) {
		
		//생성하지 않고도 값이 출력이 된다.
//		FuncStatic.cv = 20;
//		FuncStatic.staticMethod();

		//객체생성
		FuncStatic fs = new FuncStatic();
		
		fs.instanceMethod();
		FuncStatic.staticMethod();
		
		//값을 호출 및 정의
		//fs.iv = 10;
		//fs.cv = 20;
		
		//fs.instanceMethod();
		//fs.staticMethod();
		
	}
 
}
