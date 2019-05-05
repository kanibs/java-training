class Parent{
	Parent(int x){
		System.out.println("Parnt Called");
	}
}

class DemoClassWithInstance extends Parent{

	int instanceField = 10;
	static int staticField = 10;

	DemoClassWithInstance(){
		super(staticMethod()) ;
		// super(instanceMethod()) ; This is nont allowed.

	}

	public int instanceMethod(){
		System.out.println("Instance method of class");
		return 1;
	}


	public static int staticMethod(){
		System.out.println("static method of class");
		return 2;
	}

	public static void staticMethodWithoutReturn(){
		System.out.println("static method of class");
		
	}
}

class RunApp{
	public static void main(String[] args) {
		DemoClassWithInstance d = new DemoClassWithInstance();
	}
}