
public class FuncStaticTest {

	public static void main(String[] args) {
		
		//�������� �ʰ� ���� ����� �ȴ�.
//		FuncStatic.cv = 20;
//		FuncStatic.staticMethod();

		//��ü����
		FuncStatic fs = new FuncStatic();
		
		fs.instanceMethod();
		FuncStatic.staticMethod();
		
		//���� ȣ�� �� ����
		//fs.iv = 10;
		//fs.cv = 20;
		
		//fs.instanceMethod();
		//fs.staticMethod();
		
	}
 
}
