
public class StudentTest {

	public static void main(String[] args) {

		//1.
//		//생성자를 사용할 시
//		Student s1 = new Student("홍길동",10,3);
//		Student s2 = new Student("이순신",10,3);
//		Student s3 = new Student("강감찬",10,3);
//		
////		//생성자 없이 값을 초기화 안할 시 (번거로움)
////		s1.name = "홍길동";
////		s1.age = 10;
////		s1.grade = 3;
//		
//		System.out.println(s1.name);
//		System.out.println(s1.age);
//		System.out.println(s1.grade);
//		
//		System.out.println(s2.name);
//		System.out.println(s2.age);
//		System.out.println(s2.grade);
//		
//		System.out.println(s3.name);
//		System.out.println(s3.age);
//		System.out.println(s3.grade);
		
		Student s1 = new Student("장혜림",18,2);
		Student s2 = new Student("서진민",19,3);
		Student s3 = new Student("박선미",20,4);
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.grade);
		
		//2. 학생 클래스 만들기
		//국어 : 100
		//영어 : 60
		//수학 : 76
		
//		Student s1 = new Student("홍길동",3,10,100,60,76);
//		
//		System.out.println("이름 : "+ s1.name);
//		System.out.println("총점 : "+ s1.getTotal());
//		//System.out.println("평균 : "+ s1.getAverage());
//		
//		double getAverage = (s1.kor + s1.eng + s1.math)/3.0;
//			System.out.printf("평균 : "+ "%.1f", getAverage );
//		
//		System.out.println();
		
//		실행결과
//		이름 : 홍길동
//		총점 : 236
//		평균 : 78.7 (소수점 첫째자리까지 나오게 둘째자리에서 반올림한다.)
		
		
		
	}

}
