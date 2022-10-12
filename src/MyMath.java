
public class MyMath {
	//메소드 오버로딩 예시
	int add(int a, int b) {
		System.out.println("add(int a, int b)");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.println("add(long a, long b)");
		return a+b;
	}
	
	int add(int[]a) {
		System.out.println("add(int[]a)");
		int result = 0;
		
		for(int i : a) {
			result += i;
		}
		return result;
	}

}
