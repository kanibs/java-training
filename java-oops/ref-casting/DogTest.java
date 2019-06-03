//To show that compiler trusts us even when we screw up
//cast happens as these are in same inheritance tree
class Animal {
}


class Dog extends Animal {
}


class DogTest {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Dog d = (Dog) animal;   // compiles but fails later
  }
}
