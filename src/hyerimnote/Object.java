package hyerimnote;

public class Object {

	public static void main(String[] args) {
		//Obj test
		int sum = 0;
		sum += 10;
		
		System.out.println(new Obj());
		
		new Obj().power = true;
		new Obj().channel = 10;
		
		Obj t = new Obj();  //참조변수
		
		t.power = true;
		t.channel = 10;
		System.out.println(t.channel);
		
		t.ChannelDown();
		System.out.println(t.channel);
		
		Obj t2 = new Obj();
		t2.channel = 20;
		
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		t2.ChannelDown();
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		t2 = t;
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		t.ChannelDown();
		System.out.println(t.channel);
		System.out.println(t2.channel);
	}
	

}
