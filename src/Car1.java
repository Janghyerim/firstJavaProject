
public class Car1 {//생성자 부분
	//속성
	String color;  //red
	String gearType; //null
	int door;  //0
	//생성자 : 멤버변수(인스턴스)를 초기화 한다.
	//       클래스의 이름과 동일하게 작성한다.
	//       객체를 생성하는 시점에 한번만 호출되어 진다.
	//       기본생성자는 생략 가능하다.(다른 생성자가 존재하지 않을때 )
	//       생성자 오버로딩 가능
	//       모든 클래스는 생성자를 포함한다.(보이든 안보이든)
	//       this : 생성자 자기자신 / this() : 생성자간 호출
	
	
	//기본생성자 : 따로 만들지 않고도 기본적으로 생성되어 실행 되어왔다.
	//이유 : 통제가 없기 때문에 따로 생성되지 않았다.
//	Car1(){ //생성자
//		
//		color = "blue"; //값의 초기화
//		gearType = "st";
//		door = 3;
//		
//	}
	
	//this. 역할
	//this.쓰기 전 (String c)
	Car1(String color){
		this(color,"auto"); //다른 생성자의 호출
		//this.color = color; //this.: Car1 자기자신                                                                                                                                                                                                                                    ;
	}
    //this.쓰기 전 (String c,String g)
	Car1(String color,String gearType){
		this(color,gearType,4);  //다른 생성자의 호출
		this.color = color;
		this.gearType = gearType;
	}
	//this.쓰기 전 (String c,String g,int d)
	Car1(String color,String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	
	
	
	
	
	
	
	
	
	//메소드(기능)

}
