import java.util.HashSet;
import java.util.Set;
class Car {
  String color;
  String brand;

  public Car(String color, String brand) {
    super();
    this.color = color;
    this.brand = brand;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Car) {
      Car anotherCar = (Car) obj;
      if (this.color.equals(anotherCar.color) && this.brand.equals(anotherCar.brand)) {
        return true;
      }
      return false;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return 2;
  }

  @Override
  public String toString() {
    return color + ":" + brand;
  }
}

class CarSet{
  public static void main(String[] args) {
    Set<Car> cars = new HashSet<>();
    cars.add(new Car("black", "Jaguar"));
    cars.add(new Car("blue", "BMW"));
    cars.add(new Car("blue", "BMW"));
    System.out.println(cars.size());
    System.out.println(cars);
    Car blueBmw = new Car("blue", "BMW");
    System.out.println("Set has blue BMW?"+cars.contains(blueBmw));
  }
}