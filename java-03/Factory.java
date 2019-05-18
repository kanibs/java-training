abstract class Light {
// Fields:
int
noOfWatts;				// wattage
boolean indicator;		// on or off
String location;		// placement



// Instance methods:
public void switchOn() { indicator = true; }
public void switchOff() { indicator = false; }
public boolean isOn(){ return indicator; }

abstract public double kwhPrice(); // Abstract instance method // (1) No method body
}


class TubeLight extends Light {
// Field
int tubeLength; 
public double kwhPrice() { return 2.75; }  // Implementation of inherited abstract method. // (2)
}

public class Factory {
public static void main(String[] args) {
TubeLight cellarLight = new TubeLight(); // (3) OK
Light nightLight; // (4) OK
// Light tableLight = new Light();  // (5) Compile time error
nightLight = cellarLight;  // (6) OK
System.out.println("KWH price: " + nightLight.kwhPrice());
}
}