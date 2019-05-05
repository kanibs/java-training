class Vehicle{

	String name;
	String color;

	void move(){
		System.out.println("Vehicle Moving");
	}
}

class Wagon extends Vehicle{

	
}

class App{

	public static void main(String[] args) {
		Wagon w = new Wagon();
		w.name = "WagonR";
		w.color = "blue";
		System.out.println("Vehicle Name:"+w.name);
		System.out.println("Vehicle Color:"+w.color);
		w.move();
	}
}