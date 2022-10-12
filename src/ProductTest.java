
public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product();  //객체생성
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("총 생성된 객체의 수 : "+ Product.count);  //객체 수 구하기
		System.out.println("p1은 "+p1.serial+"번째 생성됨");
		System.out.println("p2는 "+p2.serial+"번째 생성됨");  
		System.out.println("p3는 "+p3.serial+"번째 생성됨");  //출력
		
		

	}

}
