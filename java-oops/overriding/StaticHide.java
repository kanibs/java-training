class Animal { 
	public static void parentMethod(){ 
		System.out.println("Static in Parent"); 
	}
} 

class Dog extends Animal {  
 
	public void parentMethod(){
		// Cannot do this- overriding static  method by instance method 
		System.out.println("Static in Child"); 
	} 
}  