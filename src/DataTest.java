
public class DataTest {

	public static void main(String[] args) {
		Data d = new Data(); //Data d�� ������ �����̴�.
//		d.x = 10;
//		System.out.println(d.x);
//		
//		change(d.x); //change();�޼ҵ� ȣ���Ͽ� ���� ������ �Ͼ��.
//		System.out.println(d.x); //change�޼ҵ带 ����Ѱ� �ƴϹǷ� �ٽ� 10�� ���.
//		}
		
		//4)����Ÿ���� ����������
		d.x = 10;
		
		Data d2 = copy(d); //����Ÿ�� �޼ҵ带 ȣ���ϰ� �Ǹ� ���������� �ٸ��̸��� ������ ȣ���ϸ� �ȴ�.
		
		System.out.println(d.x); //10
		System.out.println(d2.x); //10 ���� 10�̳� ���� �����ϰ� �ִ� ��ġ�� �ٸ���.
		                          //�������� �ּҰ��� �� ���󰡾���.
		

		//3)����������
//		d.x = 10;
//		System.out.println(d.x);
//		
//		change(d); //Ÿ���� ���ƾ� ��µȴ�. 
//		System.out.println(d.x); //���ٿ��� ���� ����Ǹ�, ��� �ϸ� ���氪���� ��µȴ�.
		
		//2)�⺻�� (�Ǽ���)
//		Data o = new Data();
//		o.y = 13.5;
//		System.out.println(o.y);
//		
//		change(o.y);
//		System.out.println(o.y);
		
		//1)�⺻�� (������)
//		Data d = new Data();
//		d.x = 10;
//		System.out.println(d.x);
//		
//		change(d.x);
//		System.out.println(d.x);
		
	}		
	
	//1)�⺻�� (������)
//	static void change(int x) {
//		x = 1000;
//		System.out.println("change() : "+ x);
//	}
	
    //2)�⺻�� (�Ǽ���)
//	static void change(double y) {
//		y = 50.5;
//		System.out.println("change() : "+ y);
//	}
	
	//3)�Ű������� ����������
//	static void change(Data d) { //�Ű����� Data d�� �ּҰ��� �޴´�.
//		d.x = 1000;
//		System.out.println("change() : "+ d.x);
//	}
	
	//4)����Ÿ���� ����������
	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		
		
		return tmp;
		
		
	  }
	}
