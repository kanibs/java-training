class InvalidHoursException extends Exception {
}


class NegativeHoursException extends InvalidHoursException {
}


class ZeroHoursException extends InvalidHoursException {
}

class Light {
  protected String billType = "Small bill";

  // (1) Instance field
  protected double getBill(int noOfHours) throws InvalidHoursException { // (2) Instance method
    if (noOfHours < 0)
      throw new NegativeHoursException();
    double smallAmount = 10.0, smallBill = smallAmount * noOfHours;
    System.out.println(billType + ": " + smallBill);
    return smallBill;
  }

  public Light makeInstance() {
    return new Light();
  } 

  public static void printBillType() {
    System.out.println("Small bill");
  } 
}


class TubeLight extends Light {
  public static String billType = "Large bill";

  @Override
  public double getBill(final int noOfHours) throws ZeroHoursException {
    if (noOfHours == 0)
      throw new ZeroHoursException();
    double largeAmount = 100.0, largeBill = largeAmount * noOfHours;
    System.out.println(billType + ": " + largeBill);
    return largeBill;
  }

  public double getBill() {
    System.out.println("No bill");
    return 0.0;
  }

  @Override
  public TubeLight makeInstance() {
    return new TubeLight();
  }

  
  
  public static void printBillType() { //  Hiding static method at (4).
    System.out.println(billType);
  }
}



public class Client {
  public static void main(String[] args) throws InvalidHoursException { 
    TubeLight tubeLight = new TubeLight();
    Light light1 = tubeLight;
    Light light2 = new Light();
    
    System.out.println("Invoke overridden instance method:");
    tubeLight.getBill(5);
    
    light1.getBill(5);
    
    light2.getBill(5);
    
    System.out.println("Invoke overridden instance method with covariant return:");
    System.out.println(light2.makeInstance().getClass()); 
    System.out.println(tubeLight.makeInstance().getClass());
    System.out.println(light1.makeInstance().getClass());
    System.out.println("Access hidden field:");
    System.out.println(tubeLight.billType);
    
    System.out.println(light1.billType);
    
    System.out.println(light2.billType);
    
    System.out.println("Invoke hidden static method:");
    tubeLight.printBillType();
    
    light1.printBillType();
    
    light2.printBillType();
    
    System.out.println("Invoke overloaded method:");
    tubeLight.getBill();
    
  }
}

