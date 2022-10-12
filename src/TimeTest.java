
public class TimeTest { //객체배열

	public static void main(String[] args) {
		
		//Time t1,t2,t3;
		Time[] time = new Time[3];
		
		for(int i=0;i<time.length;i++) {
			time[i] = new Time();  //하기  //부분 대체로 한번에 선언할 수 있음.
		}
		
		//time[0] = new Time();
		time[0].hour = 10;
		time[0].minute = 29;
		time[0].second = 33;
		
		//time[1] = new Time();
		time[1].hour = 3;
		time[1].minute = 45;
		time[1].second = 11;
		
		//time[2] = new Time();
		time[2].hour = 5;
		time[2].minute = 15;
		time[2].second = 53;
		
		//향상된 포문
		for(Time t : time) {
			System.out.println(t.hour+"시"+t.minute+"분"+t.second+"초");
			
			//무식한 포문
			System.out.println(time[0].hour+"시"+time[0].minute+"분"+time[0].second+"초");
			System.out.println(time[1].hour+"시"+time[1].minute+"분"+time[1].second+"초");
			System.out.println(time[2].hour+"시"+time[2].minute+"분"+time[2].second+"초");	
		}
		
		
	}
}
