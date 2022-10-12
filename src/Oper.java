import java.util.Scanner;

public class Oper {

	public static void main(String[] args) {
		//산술연산자
		//+, -, *, /(나누기|,몫), %(나머지)
		
//      int x = 5;
//      int y = 2;
//      System.out.println(x/y); //2
//      System.out.println(x%y); //1
//      System.out.printf("%d\n",(x/y)); //2
//      System.out.printf("%d",(x%y)); //1
        
        //일반예시
//      double pi = 3.14;
//      pi = 2.34; //값이 변경된다.
//      System.out.println(pi); 
		//상수
//      final double PI = 3.14; //소문자로 쓴다고 문법적 오류는 안나지만, 약속같은 경우이다.
//      PI = 2.34; //값을 변경 불가하고,대문자로 써줘야 한다. 결과 : 오류
//      System.out.println(PI);
        
        //형변환(자료형 or 데이터타입)
//      int -> double
//      boolean은 제외 (숫자나 문자가 아닌 참,거짓이므로...)
//      --------------------------------------------------------->  자동 형변환
//      byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)   => 정수<실수의 예
//           char(2)       < 
//      <---------------------------------------------------------  강제 형변환
		
//      byte b = 85;
//      int i = b;  //데이터 타입이 다르니 같은 타입으로 맞추기 위해 자동 형변환. 
        
//      int i = 85;
//      byte b = (byte)i;  //오류의 원인 : Type mismatch: cannot convert from int to byte 작은단위에서 큰단위로 갈 때,강제 형변환을 직접 해줘야된다.
               //테스팅 연산자
       
//		int i = 300;
//      byte b = (byte)i; //강제형변환(데이터 손실이 발생 (버려진 비트가 계산되어 자동 계산된 값이다.))
//      System.out.println(b); 
        
//      double d = 3.14;
//      int i = (int)d;
//      System.out.println(i); //소수뒤에 값이 버려지고, 앞에 정수로만 존재한다. ->3
        
//      int i = 3;
//      double d = i;
//      System.out.println(d);  //3.0
		
//		byte b = 65;
//		char c = (char)b;
//		System.out.println(c); //아스키코드 변환으로 인해 'A'가 출력된다.
		
//		int x = 10;
//		int y = 20;
//		int result = x + y;
//		System.out.println(result);
		
//		byte b1 = 10;
//		byte b2 = 20;
//		byte result = (byte)(b1 + b2); //byte b = (byte)(int + int)  
//		System.out.println(result);
		
		//연산시 int보다 작은 정수타입은 모두 int형으로 자동 형변환 된다.
//		byte + byte -> int + int
//		byte + short -> int + int
//      char + byte -> int + int // char 는 문자이나 유니코드로 변환하여 숫자로 표현이 된다.
		
		//int형보다 범위가 더 크면 큰걸로 따라감.
//		int + long -> long + long
//		int + float -> float + float 
//		float + double -> double + double
		
		//예제)
//		int x = 5;
//		int y = 2;
//		double result = x / y; //2.0
//		double result = x % y; //1.0
//		System.out.println(result);
		
		//예제)
//		int x = 3;
//		int y = 5;
//		//double result = (double)x / y; // 3.0/5.0 = 0.6 
//		double result = (double)(x / y); // 0.0
//		System.out.println(result);
		
		//String 형변환 예제
//		String str = "java";
//		double ver =1.8;
//		String result = str + ver; //"java" + "1.8" -> "java1.8"
//		System.out.println(result);
	
//		       (어떤타입이건)
//		String + anyType -> String
//		String + double -> String + String -> String
		
		//+ => 산술, 연결, 부호(양수or음수)
		
	
		
		//증감연산자 : 값을 1 증가, 값을 1 감소 
		// ++ , --
		//변수에만 사용 가능하다.
		//전치, 후치 사용 가능하다.
		
		//예제
//		int x = 10;
//		++x; //11
//		System.out.println(x);
//		x++; //12
//		System.out.println(x);
//		--x; //11
//		System.out.println(x);
//		x--; //10
//		System.out.println(x);
		
		//예제
//		int x = 10;
//		int y = 0;
//		
//		y = x++ +10; // x=11 , y=20 연산자가 뒤에 있다면, 우선순위 먼저 끝내고 뒤에 다시 증감시킨다.
//		System.out.println("x = "+ x +","+"y = "+y);
		
//		y = ++x + 10; // x=11 , y=21 연산자가 앞에 있다면,제일 우선순위 이니 먼저 증감 시키고 y값을 구한다.
//		System.out.println(y);
//		System.out.println("x = "+ x +","+"y = "+y);
		
		//대입연산자 
		//변수에 사용되는 연산자
		// = , += , -= , *= , /= , <<= , |= ......
		//int a = 10; // = -> 단순대입연산자
		
		
		//복합대입연산자
//	    int x = 10; //연산을 진행 할때는 변수에 값을 꼭 넣어야 한다.
//	    x += 10; // x = x + 10
//		System.out.println(x); //20
//		
//		x -= 10;
//		System.out.println(x); //0
//		
//		x *= 2;
//		System.out.println(x); //20
		
		
		//비교연산자
		// 5>3 
		// < , > , <= , >= , ==(같으냐) , !=(다르냐)
		//true or false
		
//		int x = 10;
//		int y = 20;
//		System.out.println(x < y); //true
//		System.out.println(x > y); //false
//		System.out.println(x <= y); //true
//		System.out.println(x >= y); //false
//		System.out.println(x == y); //false 
//		System.out.println(x != y); //true
		
		//논리연산자
		//&& : AND 연산 / 모두 true인 경우에만 true
		//|| : OR 연산 / 모두 false인 경우에만 false
		// ! : NOT 연산 / a가 true이면 false , false이면 true
		//두가지 이상의 조건을 확인할 때 사용한다.
		
		//예제
//		int x = 10;
//		int y = 20;
//		int z = 30;
//		System.out.println(x == 10);
//		System.out.println(y == 20);
//		System.out.println(z == 30);
		
		
		//&& AND 연산자
//		x == 10 && y == 20 // true && true
//		System.out.println(x == 10 && y == 20); // true && true => true 
//		System.out.println(x == 10 && y == 30); // true && false => false
//		System.out.println(x == 50 && y == 30); // false && false => false
//		System.out.println(x == 10 && y == 20 && z == 30); // true && true && true => true
//		System.out.println(x == 10 && y == 20 && z == 40); // true && true && false => false
		
//		true && true => true
//	    true && false => false
//      false && true => false
//		false && false => false
		
		//|| OR 연산자
//		int x = 10;
//		int y = 20;
//		int z = 30;
//
//      System.out.println(x == 10 || y == 20); //true
//      System.out.println(x == 30 || y == 20); //true
//      System.out.println(x == 30 || y == 50); //false
	
//		true || true => true
//	    true || false => true
//      false || true => true
//		false || false => false 
		
		//! NOT 연산자
		//!true -> false
		//!false ->true
        
//      int x = 10;
//      System.out.println(!(x==10)); //false
//      System.out.println(!(x==20)); //true
       
//      실수와 정수의 비교예제
//		(3.45 <= 2) => (double <= int) => (double <= double) => double형변환  //false
//      (3.45 <= 2.0)
		
		//조건연산자 (삼항연산자 : 데이터가 3개 필요)
		// 조건식                         ?  결과 1  : 결과 2
		//(true or false) ? (true) : (false)
		
//		int x = 10;
//		int y = 20;
//		int result =(x>y)? x : y; //20
//		System.out.println(result);
//		
//		int age = 20;
//		String rs = (age>=20)? "성인 입니다." : "미성년 입니다.";
//		System.out.println(rs); //성인 입니다.
		
		
		// 456 -> 400 , 111 -> 100
//		Scanner sc = new Scanner(System.in);
//		System.out.println("백의 자리숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		System.out.println("입력 받은 값 : " + num);
//		System.out.println("연산 되어진 값 : " + num/100*100);
		
		// 333 -> 331 , 777 -> 771
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1의자리 숫자를 무조건 1로 변경하세요.");
//		int num = sc.nextInt();
//
//		System.out.println("입력 받은 값 : " + num);
//		System.out.println("연산 되어진 값 : " + (num/10*10+1));
		
//		int i = sc.nextInt();
//		System.out.println("입력받은 값 : " + i);
//		System.out.println("연산되어진 결과 : " + (i / 10 * 10 + 1));
		
		//10의 배수
        //19 -> 20 , 81 -> 90
//		Scanner sc = new Scanner(System.in);
//        System.out.println("입력 값에 가까운 10의 배수를 구하시오.");
//        int num = sc.nextInt();
//	
//        System.out.println("입력받은 값 : " + num);
//        System.out.println("연산되어진 결과 : " + ((num/10+1)*10));
	
	    //19 - 20 -> 1, 81 - 90 -> 9 , 24 -> 6	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("십의자리 숫자를 입력하세요.");
//		int num = sc.nextInt();
//	
//		System.out.println("입력받은 값 : " + num);
//		System.out.println(10 - num % 10);
	
	    // 30 - 24 = 6
		// 24 % 10 = 4
		// 10 - 4 = 6
		
		//사과의 개수를 입력받는다.
		//한 바구니에 10개의 사과를 담을 수 있다.
		//그럼 몇개의 바구니가 필요할까요?
		//123 -> 13개 , 456 -> 46개 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("사과의 갯수를 입력하세요 : ");
//		int appleNum = sc.nextInt();
//		
//	    int basketNum = appleNum / 10 + (appleNum % 10 > 0 ? 1 : 0);
//		System.out.println("한 바구니에 10개의 사과를 담을 수 있습니다.");
//		System.out.println("그럼 몇 개의 바구니가 필요할까요?");
//		
//		System.out.println(basketNum + "개");
//		System.out.println("총 사과의 갯수는 " + appleNum + "개 이며 바구니는 " + basketNum + "개 필요합니다.");
//		
//		System.out.print("사과의 갯수를 입력하세요 : ");
//		int apple = sc.nextInt();
//		
//		int c = apple / 10 + (apple % 10 > 0 ? 1:0);
//		System.out.println("사과의 갯수 " + apple + "개");
//		System.out.println("바구니의 갯수 " + c + "개 필요합니다.");
		
		//논리연산자 예제
//		int x = -3;
//		System.out.println(x >= 0 && x <= 10);
//		System.out.println(!(x > 0 && x < 10));
//		System.out.println(x <= 0 || x >= 10);

  }

}
