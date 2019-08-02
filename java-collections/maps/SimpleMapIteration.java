import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SimpleMapIteration {

  public static void main(String[] args) {
    Map<Person, Car> map = new HashMap<>();
    Person p1 = new Person("P1");
    Person p2 = new Person("P2");
    Person p3 = new Person("P3");

    Car blue = new Car("BMW", "v002");
    Car black = new Car("BMW", "v003");
    Car red = new Car("Audi", "v004");


    map.put(p1, blue);
    map.put(p2, red);
    // map.put(p2, black); -> this will override red for p2.

    map.put(p3, black);
    System.out.println("Plain Map :" + map);

    System.out.println("\nPrinting Map.Entry");
    Set<Entry<Person, Car>> entries = map.entrySet();
    for (Entry<Person, Car> entry : entries) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }

    System.out.println("\nUsing Keyset approach to print the map");
    Set<Person> keys = map.keySet();
    for (Person p : keys) {
      System.out.println(map.get(p));
    }
  }
}


class Car {

  String brand;
  String vin;

  public Car(String brand, String vin) {
    super();
    this.brand = brand;
    this.vin = vin;
  }

  @Override
  public String toString() {
    return "Car [brand=" + brand + ", vin=" + vin + "]";
  }


}


class Person {
  String name;

  public Person(String name) {
    super();
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }

}
