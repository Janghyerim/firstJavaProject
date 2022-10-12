
public class OverLoadingTest {

	public static void main(String[] args) {
		
		OverLoading ol = new OverLoading();
		//ol.이름이 같더라고 조건(타입)에 따라 고를 수 있음.
		ol.add();
		ol.add(3);
		ol.add(3L);
		ol.add(2, 3);
		ol.add(2, 3L);
		ol.add(2L, 3);
		

	}

}
