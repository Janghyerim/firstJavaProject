
public class Car1 {//������ �κ�
	//�Ӽ�
	String color;  //red
	String gearType; //null
	int door;  //0
	//������ : �������(�ν��Ͻ�)�� �ʱ�ȭ �Ѵ�.
	//       Ŭ������ �̸��� �����ϰ� �ۼ��Ѵ�.
	//       ��ü�� �����ϴ� ������ �ѹ��� ȣ��Ǿ� ����.
	//       �⺻�����ڴ� ���� �����ϴ�.(�ٸ� �����ڰ� �������� ������ )
	//       ������ �����ε� ����
	//       ��� Ŭ������ �����ڸ� �����Ѵ�.(���̵� �Ⱥ��̵�)
	//       this : ������ �ڱ��ڽ� / this() : �����ڰ� ȣ��
	
	
	//�⺻������ : ���� ������ �ʰ� �⺻������ �����Ǿ� ���� �Ǿ�Դ�.
	//���� : ������ ���� ������ ���� �������� �ʾҴ�.
//	Car1(){ //������
//		
//		color = "blue"; //���� �ʱ�ȭ
//		gearType = "st";
//		door = 3;
//		
//	}
	
	//this. ����
	//this.���� �� (String c)
	Car1(String color){
		this(color,"auto"); //�ٸ� �������� ȣ��
		//this.color = color; //this.: Car1 �ڱ��ڽ�                                                                                                                                                                                                                                    ;
	}
    //this.���� �� (String c,String g)
	Car1(String color,String gearType){
		this(color,gearType,4);  //�ٸ� �������� ȣ��
		this.color = color;
		this.gearType = gearType;
	}
	//this.���� �� (String c,String g,int d)
	Car1(String color,String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	
	
	
	
	
	
	
	
	
	//�޼ҵ�(���)

}
