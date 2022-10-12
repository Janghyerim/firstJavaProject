
public class carTest {

	public static void main(String[] args) {
		
		Car[] car = new Car[3];
		
		for(int i=0;i<car.length;i++) {
			car[i] = new Car();
		}
		
		car[0].model = "volvo";
		car[0].color = "white";
		car[0].passengers = 2;
		car[0].tire = 4;
		car[0].maxSpeed = 200;
		car[0].trunkSize = 495;
		car[0].Weight = 2375;
		car[0].overAllLength = 1645;
		car[0].displacement = 10; 
		car[0].fuelTank = 71;
		
		car[1].model = "K5";
		car[1].color = "white";
		car[1].passengers = 2;
		car[1].tire = 4;
		car[1].maxSpeed = 230;
		car[1].trunkSize = 350;
		car[1].Weight = 2000;
		car[1].overAllLength = 1576;
		car[1].displacement = 13; 
		car[1].fuelTank = 80;
		
		car[2].model = "morning";
		car[2].color = "ivory";
		car[2].passengers = 2;
		car[2].tire = 4;
		car[2].maxSpeed = 190;
		car[2].trunkSize = 250;
		car[2].Weight = 1700;
		car[2].overAllLength = 1300;
		car[2].displacement = 9; 
		car[2].fuelTank = 50;
		
		for(Car c : car) {
			System.out.println(c.model+" "+c.color+"»φ "+c.passengers+"Έν "+c.tire+"°³ "+c.maxSpeed+"/Km "+c.trunkSize+" "+c.Weight+"Kg "+c.overAllLength+"cm "+c.displacement+"Km/l "+c.fuelTank+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
