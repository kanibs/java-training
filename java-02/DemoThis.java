// To compile this file, use javac DemoThis.java
//To run this file use java Person

class Person{

	String name;

	String decorateName(String name){
		this.name = this.name+name;
		return this.name;
	}

	String decorateNameWithDiffVarName(String n){
		name = name+n;
		return name;
	}

	public static void main(String[] args) {
		
		Person jacob = new Person();
		jacob.name = "Jacob";

		jacob.decorateName("John");
		System.out.println("Jacob's Name:"+jacob.name);		

		jacob.decorateNameWithDiffVarName("John");

		System.out.println("Jacob's Name after Second call:"+jacob.name);	
	}

}