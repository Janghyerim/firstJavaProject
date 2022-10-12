
public class Car1Test {

	public static void main(String[] args) {
		
//		Car1 c1 = new Car1(); //객체 생성  //Car1(); -> 생성자의 호출 
//		
//		c1.color = "red";
//		c1.gearType = "auto";
//		c1.door = 4;               //값의 초기화
//		
//		System.out.println(c1.color);
//		System.out.println(c1.gearType);
//		System.out.println(c1.door);
//		
//		Car1 c2 = new Car1();
//		System.out.println(c2.color);
//		System.out.println(c2.gearType);
//		System.out.println(c2.door);
		
		Car1 c3 = new Car1("red");
		System.out.println(c3.color);
		System.out.println(c3.gearType);
		System.out.println(c3.door);
	
		Car1 c4 = new Car1("blue","auto");
		System.out.println(c4.color);
		System.out.println(c4.gearType);
		System.out.println(c4.door);

		Car1 c5 = new Car1("yellow","auto",6);
		System.out.println(c5.color);
		System.out.println(c5.gearType);
		System.out.println(c5.door);
		
	}
	
	

}
