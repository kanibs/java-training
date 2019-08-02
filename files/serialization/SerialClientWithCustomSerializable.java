import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Wheel {
  private int wheelSize;

  Wheel(int ws) {
    wheelSize = ws;
  }

  public int getWheelSize() {
    return wheelSize;
  }

  public String toString() {
    return "wheel size: " + wheelSize;
  }
}


class Unicycle implements Serializable {
  transient private Wheel wheel;

  Unicycle(Wheel wheel) {
    this.wheel = wheel;
  }

  public String toString() {
    return "Unicycle with " + wheel;
  }

  private void writeObject(ObjectOutputStream oos) {
    try {
      oos.defaultWriteObject();
      oos.writeInt(wheel.getWheelSize());
    } catch (IOException e) {
      e.printStackTrace();
    }
  } 

  private void readObject(ObjectInputStream ois) {
    try {
      ois.defaultReadObject();
      int wheelSize = ois.readInt();
      wheel = new Wheel(wheelSize);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

}


class SerialClientWithCustomSerializable {
  public static void main(String args[]) throws IOException, ClassNotFoundException {
    SerialClientWithCustomSerializable demo = new SerialClientWithCustomSerializable();
    demo.writeData();
    demo.readData();
  }

  void writeData() throws IOException {
    
    FileOutputStream outputFile = new FileOutputStream("storage.dat");
    ObjectOutputStream outputStream = new ObjectOutputStream(outputFile);

    Wheel wheel = new Wheel(65);
    Unicycle uc = new Unicycle(wheel);
    System.out.println("Before writing: " + uc);
    outputStream.writeObject(uc);

    outputStream.flush();
    outputStream.close();
  }

  void readData() throws IOException, ClassNotFoundException {
    FileInputStream inputFile = new FileInputStream("storage.dat");
    ObjectInputStream inputStream = new ObjectInputStream(inputFile);
    Unicycle uc = (Unicycle) inputStream.readObject();
    System.out.println("After reading: " + uc);
    inputStream.close();
  }
}