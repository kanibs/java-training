class Vehicle{

	String name;
	String color;
	String chassiNumber;

	Vehicle(String chassiNumber ){
		this.chassiNumber = chassiNumber;
		System.out.println("Parent Constructor is called");
	}

	// Vehicle(){
	// 	// this("someRandomNumber");
	// }

}

class Wagon extends Vehicle{

	Wagon(String number){
		
		super(number);
		System.out.println("Constructor with 1 arguements is called");
	}

	Wagon(String number, String name, String color){
		this(number);
		this.name = name;
		this.color = color;
		System.out.println("Constructor with 3 arguements is called");
	}

	void display(){
		System.out.println("Vehicle Name:"+name);
		System.out.println("Vehicle Color:"+color);
		System.out.println("Number :"+chassiNumber);
	}
	
}

class DefaulrConstructorApp{

	public static void main(String[] args) {
		Wagon w = new Wagon("879879");
		w.display();
		System.out.println("========================");
		Wagon w1= new Wagon("879879", "Wagon" , "Blue");
		w1.display();
		
	}
}