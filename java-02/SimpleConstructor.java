class Machine{

	Machine(){
		System.out.println("A machine Object is created");
	}


	void Machine(){   // Not a good practice
		System.out.println("A machine method is called");
	}

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 3 ; i++){
			Machine m = new Machine();  // 3 objects getting created
			m.Machine();
		}
	}
}