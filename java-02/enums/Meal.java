public enum Meal {

	BREAKFAST(7, 30), 
	LUNCH(12, 15), 
	DINNER(19, 45);

	Meal(int hh, int mm) {
		this.hh = hh;
		this.mm = mm;
	}

	// Fields for the meal time:
	private int hh;
	private int mm;

    public void fun(){
    	System.out.println("Fun Method");
    }
     
	// Instance methods:
	public int getHour() {
		return this.hh;
	}

	public int getMins() {
		return this.mm;
	}
}