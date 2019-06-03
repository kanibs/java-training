import java.util.HashMap;
import java.util.Map;
class Dog {
  public Dog(String n) {
    name = n;
  }

  public String name;

  public boolean equals(Object o) {
    if ((o instanceof Dog) && (((Dog) o).name == name)) {
      return true;
    } else {
      return false;
    }
  }

  public int hashCode() {
    return name.length();
  }
}


class Cat {
}


enum Pets {
  DOG, CAT, HORSE
}

class MapTest{
	public static void main(String[] args) {
		Map<Object, Object> m = new HashMap<Object, Object>();
    m.put("k1", new Dog("aiko"));
    m.put("k2", Pets.DOG);
    m.put(Pets.CAT, "CAT key from Enum");
    Dog d1 = new Dog("clover");
    m.put(d1, "Dog key");
    m.put(new Cat(), "Cat key");
    System.out.println("First Line:"+m.get("k1"));
    String k2 = "k2";
    System.out.println(m.get(k2));
    Pets p = Pets.CAT;
    System.out.println(m.get(p));

    System.out.println(m.get(new Cat()));
    System.out.println(m.size());
	System.out.println("d1 Before changing the value of the Object");
    System.out.println(m.get(d1));
    // Dog newDog = new Dog("clover");
    // System.out.println("Added?"+m.put(newDog, "New Dog Added"));
    // System.out.println("After Adding:"+m.get(d1));
    ////////////////// an object used as a key has its values changed

    System.out.println("d1 After changing the value of the Object");
    d1.name = "magnolia";
	System.out.println(m.get(d1));
  System.out.println(m);

	}
}