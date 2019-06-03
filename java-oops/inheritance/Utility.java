class Light {

  int noOfWatts;
  private boolean indicator;
  protected String location;
  // Static field:
  private static int counter;

  Light() {
    noOfWatts = 50;
    indicator = true;
    location = "X";
    counter++;
  }

  // Instance methods:
  public void switchOn() {
    indicator = true;
  }

  public void switchOff() {
    indicator = false;
  }

  public boolean isOn() {
    return indicator;
  }

  private void printLocation() {
    System.out.println("Location: " + location);
  }

  // Static methods:
  public static void writeCount() {
    System.out.println("Number of lights: " + counter);
  }

}


class TubeLight extends Light {
  // (2) Subclass uses the extends clause.
  // Instance fields:
  private int tubeLength = 54;
  private int colorNo = 10;

  // Instance methods:
  public int getTubeLength() {
    return tubeLength;
  }

  public void printInfo() {
    System.out.println("Tube length: " + getTubeLength());
    System.out.println("Color number: " + colorNo);
    System.out.println("Wattage: " + noOfWatts);
    // System.out.println("Indicator: " + indicator); -> private member
    System.out.println("Indicator: " + isOn());
    System.out.println("Location: " + location);
    // printLocation();
    // System.out.println("Counter: " + counter); -> private
    writeCount();

  }

}


public class Utility {
  // (3)
  public static void main(String[] args) {
    new TubeLight().printInfo();
  }
}