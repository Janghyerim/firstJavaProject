
public class DataTest {

	public static void main(String[] args) {
		Data d = new Data(); //Data d은 참조형 변수이다.
//		d.x = 10;
//		System.out.println(d.x);
//		
//		change(d.x); //change();메소드 호출하여 값의 변경이 일어난다.
//		System.out.println(d.x); //change메소드를 출력한게 아니므로 다시 10이 뜬다.
//		}
		
		//4)리턴타입을 참조형으로
		d.x = 10;
		
		Data d2 = copy(d); //리턴타입 메소드를 호출하게 되면 참조변수의 다른이름을 생성해 호출하면 된다.
		
		System.out.println(d.x); //10
		System.out.println(d2.x); //10 같은 10이나 서로 참조하고 있는 위치는 다르다.
		                          //참조형은 주소값을 잘 따라가야함.
		

		//3)참조형변수
//		d.x = 10;
//		System.out.println(d.x);
//		
//		change(d); //타입이 같아야 출력된다. 
//		System.out.println(d.x); //윗줄에서 값이 변경되면, 출력 하면 변경값으로 출력된다.
		
		//2)기본형 (실수형)
//		Data o = new Data();
//		o.y = 13.5;
//		System.out.println(o.y);
//		
//		change(o.y);
//		System.out.println(o.y);
		
		//1)기본형 (정수형)
//		Data d = new Data();
//		d.x = 10;
//		System.out.println(d.x);
//		
//		change(d.x);
//		System.out.println(d.x);
		
	}		
	
	//1)기본형 (정수형)
//	static void change(int x) {
//		x = 1000;
//		System.out.println("change() : "+ x);
//	}
	
    //2)기본형 (실수형)
//	static void change(double y) {
//		y = 50.5;
//		System.out.println("change() : "+ y);
//	}
	
	//3)매개변수를 참조형변수
//	static void change(Data d) { //매개변수 Data d는 주소값을 받는다.
//		d.x = 1000;
//		System.out.println("change() : "+ d.x);
//	}
	
	//4)리턴타입을 참조형으로
	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		
		
		return tmp;
		
		
	  }
	}
