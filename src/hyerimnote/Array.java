package hyerimnote;

public class Array {

	public static void main(String[] args) {
		//int[] arr;         //선언
		//arr = new int[5];  //생성
		//int[] arr = new int[5];  //선언과 생성을 같이 한 공식
//		int[] arr = {10,20,30,40,50}; //선언,생성,초기화까지 같이 한 공식
//        
//		arr[0] = 10;  //조건문
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		
//		System.out.println(arr[0]);  //출력
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		//char[] c = new char[4];  //선언과 생성을 같이 한 공식
//		char[] c = {'O','O','T','D'};
//		System.out.println(c);
		
		//String[] s = new String[3];  //선언과 생성을 같이 한 공식
//		String[] s = {"jang","hye","rim"};
//		System.out.print(s[0]);    //인덱스 번호 0부터 쓰라고!!!!!!!!!!!
//		s[2] = "bong";
//		System.out.print(s[1]);
//		System.out.println(s[2]);
		
		//배열의 대입
		int x = 10;
		int y;
		
		y = x;
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2;
		
		arr2 = arr1;
		
		System.out.println(arr1[0]); //1
		System.out.println(arr2[0]); //1
		
		arr2[4] = 10;
		
		System.out.println(arr1[4]); //10
		System.out.println(arr2[4]); //10
		
		//배열의 활용
		//특징: 순차처리,반복문 사용,초기값0설정
		
		int[] arr = new int[10];
		
		for(int i = 0;i<arr.length;i++) {
			arr[i] = 1; //인덱스가 반복되면 5번이 실행되는 동안 0,1,2,3,4에 각각 1이 대입된다.
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}  //1,1,1,1,1,1,1,1,1,1
		
		//예제 (1~10까지 출력한다면..)
		
		int[] seo = new int[10];
		
		for(int i = 0;i<seo.length;i++) {
			seo[i] = i+1;
		}
		
		for(int i = 0;i<seo.length;i++) {
			System.out.println(seo[i]);
		}
		//예제+배열의 합 구하기
		int sum = 0;
		for(int i=0;i<seo.length;i++) {
			sum += seo[i];
		}
		System.out.println(sum);
		
		//예제+홀짝 합구하기
		int j = 0;
		int s = 0;
		for(int i = 0;i<seo.length;i++) {
			if(seo[i] %2==1) {
				j += seo[i];
			}else {
				s += seo[i];
			}
		}
		System.out.println("홀수 : "+j);
		System.out.println("짝수 : "+s);
		
		//For each문
		//예제
		int[] err = {1,2,3,4,5};
		for(int i : err) {
			System.out.println(i);
		}
		
		//향상된 for문
		int num = 0;
		for (int i : err) {
			num += i;
		}
		//문자열예제
		String[] jkl = {"샤머","복숭아","체리"};
	
		for(String h : jkl) {
			System.out.println(h);
		}
		//난수 1~100사이의 값중에 10개를 배열값으로 초기화한다.
				//배열의 값을 출력한다.
				/**배열의 값에 난수 랜덤 변수를 선언해줘야함.
				 */ 
		
		
		
		
		
		
		
		
		
	}

}
