class Vehicle{

	String name;
	String color;

	void move(){
		System.out.println("Vehicle Moving");
	}
}

class Wagon extends Vehicle{

	Wagon(){
		this(10);
	}
	
	Wagon(int x){
		this();
	}
	
}

class NoSuper{

	public static void main(String[] args) {
		Wagon w = new Wagon(10);
	}
}