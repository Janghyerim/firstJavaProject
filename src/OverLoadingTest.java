
public class OverLoadingTest {

	public static void main(String[] args) {
		
		OverLoading ol = new OverLoading();
		//ol.�̸��� ������� ����(Ÿ��)�� ���� �� �� ����.
		ol.add();
		ol.add(3);
		ol.add(3L);
		ol.add(2, 3);
		ol.add(2, 3L);
		ol.add(2L, 3);
		

	}

}
