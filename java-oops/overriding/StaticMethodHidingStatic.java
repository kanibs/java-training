//static methods can hide the static methods in Parent class but only if the conoditions of overriding
//are satisfied.

class StaticMethodHidingStatic extends Parent{
	// public static void staticMethod() throws Exception{   // This is hiding the method but if the conditions
	// 	System.out.println("Child static method");          // for legal override are failing then it gives 
	// }												   //error

	public static void staticMethod(int x) throws Exception{ // This is overload of the static method.
		System.out.println("Overloaoded Child static method");
	}

	public static void main(String[] args) throws Exception{
			Parent p = new StaticMethodHidingStatic();
			p.staticMethod();

			StaticMethodHidingStatic sm = new StaticMethodHidingStatic();
			sm.staticMethod();
	}

	public static void instanceMethod(){
		System.out.println("Child instance method");
	}
}


class Parent{

	public static void staticMethod(){
		System.out.println("Parent instance method");
	} 

	public void instanceMethod(){
		System.out.println("Parent static method");
	} 
}