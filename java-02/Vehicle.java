class Vehicle{
	String name;
	String color;

	Vehicle(){  // non-parameterised Constructor
		this.name = "Demo Vehicle";
		this.color = "Black";
	}

	Vehicle(String name, String color){  // parameterised Constructor
		this.name = name;
		this.color = color;
	}

	void dislayVehicleDetails(){
		System.out.println("Name is:"+ this.name);
		System.out.println("Coler is:"+this.color);
	}

	public static void main(String[] args) {
		Vehicle demoVehicle1 = new Vehicle();
		Vehicle demoVehicle2 = new Vehicle();

		demoVehicle1.dislayVehicleDetails();
		demoVehicle2.dislayVehicleDetails();

		System.out.println("====================================");

		Vehicle innova = new Vehicle("Innova" , "White");
		Vehicle ciaz = new Vehicle("Ciaz" , "Blue");

		innova.dislayVehicleDetails();
		ciaz.dislayVehicleDetails();
	}
}