
public class VarTest {

	public static void main(String[] args) {
//		자주쓰는 데이터타입 : 숫자,문자,문자열,논리   etc)날짜,이미지,동영상
//      변수 : 값을 저장하는 공간, 값을 변경할 수 있다.
//		자료형 변수명; -> 변수의 선언
//
//      숫자 : 정수, 실수
//      문자 : 문자, 문자열
//		논리 : 참, 거짓 
//		
//		논리
//		참,거짓 : boolean
//		
//		숫자
//		정수 : byte / short / int / long
//		실수 : float / double
//		
//		문자
//		문자 : char ' '
//		문자열 : String " "

//      byte 개념
		byte b; //byte : -128 ~ 127
		b = 10;
		System.out.println(b);
		
		b = 20;
		System.out.println(b);

//		int 개념
		int i; //int : -21억 ~ 21억 정도 
		i = 300;
		System.out.println(i);
//		
		int x;
		int y;
		int z;
		
		//int x,y,z;
		
		//x=y=z=10;
		
		//int x=10,y=20,z=30; //선언과 초기화를 동시에 진행 하는 서식
		
		x = 10;
		y = 20;
		z = 30;
		
		System.out.println(x);
	    System.out.println(y);
		System.out.println(z);
		
//		short 개념
//		short s = 10; //short : -32768 ~ 32767
      
//		long 개념  
//      long l = 10L; //long : 많이 큼.  /특징 : 숫자뒤에 L을 붙여줘야 한다. 		
		
//		char 개념
//		char c;  //char : 0 ~ 65525 (정수를 다룸.)
//		c= 'a';
//		System.out.println(c);
//		
//		char c2 = '가';
//	    System.out.println(c2);
//		
//	    char c = 'A'; //65 char의 변수를 정수로 선언할 때, int로 한번 더 선언하고 출력하면 코드법대로 65가 출력된다.
//	    int i = c;
//	    System.out.printf("%c\n",c);
//	    System.out.printf("%d",i);   //%d : +-부호 있는 정수 byte,short,int에 사용 되고 long은 %l으로 쓴다.
//	    
//	    char c1,c2;
//	    c1 = 'A'; //65
//	    c2 = 'B'; //66
//	    System.out.println(c1+c2); // 'A'+'B'
		
		//'A'->65, 'a'->97 , '0'->48
	    
//		String 개념
		String str = "A";
		String str2 = "abc";
		
		System.out.println(str);
		System.out.println(str2);
		System.out.printf("%s\n", str);
		System.out.printf("%s\n", str2);
		
//		float 개념
		float f = 3.14159445463f;  //접미사는 필수 (대,소문자 상관없음.)
		System.out.println(f);
		System.out.printf("%.3f\n", f); //소수점도 .여섯째자리까지 나타낼수 있다. / %뒤에 .2를 넣으면 둘째자리까지 나타낼 수 있다.
		
//		double 개념
		double d = 3.14; //접미사는 선택사항 (대,소문자 상관없음.)
		System.out.println(d);
		System.out.printf("%.4f", d);
		
//		자료형의 기본 타입
//		정수 : int
//		실수 : double
		
//     	boolean 개념
//		boolean b;
//		b = true;
//		System.out.println(b);
//		b = false;
//		System.out.println(b);
		
//		변수의 기본값
//		boolean -> false
//		byte    -> 0
//		short   -> 0
//		int     -> 0
//		long    -> 0L
//		
//		char    -> ''  // 칸 벌림 하면 안된다.
//		
//		float   -> 0.0f
//		double  -> 0.0d //접미사 선택사항
//		
//		String  -> null, ""  // 칸 벌림 상관없음.
		
//		리터럴 : 변수에 사용되는 값
		
	  }

}
