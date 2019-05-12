abstract class Light {
	int noOfWatts;
	boolean indicator;
	String location;

	public void switchOn() {
		indicator = true;
	}

	public void switchOff() {
		indicator = false;
	}

	public boolean isOn() {
		return indicator;
	}

	abstract public double kwhPrice();
}

class TubeLight extends Light {
	int tubeLength;

	public double kwhPrice() {
		return 2.75;
	}
}

class Factory {
	public static void main(String[] args) {
		TubeLight cellarLight = new TubeLight();
		Light nightLight;
		nightLight = cellarLight;
		System.out.println("KWH price: " + nightLight.kwhPrice());
	}
}