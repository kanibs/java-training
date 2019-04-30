class MusicApp{

	public static void main(String[] args) {
		CD compactDisc = new CD();
		compactDisc.songs =  new String[] {"Rockabye" , "Freinds" , "Lushlife"};

		MusicSystem musicSystem = new MusicSystem();
		musicSystem.eject(compactDisc);
		musicSystem.playSongs();

	}
}