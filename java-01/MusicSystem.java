class MusicSystem{

	CD cdToPLay;

	public void eject(CD cd){
		System.out.println("Inserting the Disc... getting ready");
		cdToPLay = cd;
	}

	public void playSongs(){
		cdToPLay.play();
	}

}