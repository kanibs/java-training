class Car {
  String vin;
  String color;
  String brand;
  String model;

  public Car(String vin, String color, String brand, String model) {
    this.vin = vin;
    this.color = color;
    this.brand = brand;
    this.model = model;
  }

  public static void main(String[] args) {
    Car redAudiA6 = new Car("au01", "Red", "Audi", "A6");
    Car blueBMWCX = new Car("bm01", "Blue", "BMW", "CX");

    System.out.println("redAudi.equals(blueBMWCX)=" + redAudiA6.equals(blueBMWCX));

    Car anotherRedAudiA6 = new Car("au01", "Red", "Audi", "A6");

    System.out.println("redAudi.equals(anotherRedAudiA6)=" + redAudiA6.equals(anotherRedAudiA6));
  }

  @Override
  public boolean equals(Object obj) {
    if ((obj instanceof Car)) {
      Car anotherCar = (Car) obj;
      if (this.vin == anotherCar.vin && this.color.equals(anotherCar.color)
          && this.model.equals(anotherCar.model)) {
        return true;
      }
      return false;
    }
    return false;
  }

}