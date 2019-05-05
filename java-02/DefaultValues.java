class DefaultValues{

	//Global vars.
	int x;
	Datatypes dt;
	float f;
	static int statciVar = 100;

	public void useLocalVariables(){
		int someLocalVariable;  	// This does not gets a default value
		Datatypes dt ; 				// same here.
		//System.out.println("local dt = "+dt); // CTE
		
		int y = 20;

		if(y == 10){
			someLocalVariable = 10;  // Give value in this branch
		}else{
			someLocalVariable = 20; // Give value in this branch as well.
		}
		System.out.println("someLocalVariable = "+someLocalVariable);
	}

	public static void main(String[] args) {
		DefaultValues df = new DefaultValues();
		System.out.println("Int x ="+DefaultValues.statciVar);
		df.useLocalVariables();
		System.out.println("Int x = "+df.x);
		System.out.println("Datatypes dt = "+df.dt);
		System.out.println("float f = "+df.f);	
	}
}