class CD{

	String[] songs;
	
	public void play() {
		System.out.println("Preparing to play the songs....");
		System.out.println("Rotating the disc to point the head....");
		for(String song: songs){
			System.out.println("Playing song:" +song+"...");
			try{Thread.sleep(5000);}catch(Exception e){}
			
		}
	}
}