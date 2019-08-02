import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Wheel implements Serializable {
  private int wheelSize;

  Wheel(int ws) {
    wheelSize = ws;
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
}


class SerialClientWithTransient {
  public static void main(String args[]) throws IOException, ClassNotFoundException {
    SerialClientWithTransient demo = new SerialClientWithTransient();
    demo.writeData();
    demo.readData();
  }

  void writeData() throws IOException {
    // (4)
    // Set up the output stream:
    FileOutputStream outputFile = new FileOutputStream("storage.dat");
    ObjectOutputStream outputStream = new ObjectOutputStream(outputFile);

    // Write the data:
    Wheel wheel = new Wheel(65);
    Unicycle uc = new Unicycle(wheel);
    System.out.println("Before writing: " + uc);
    outputStream.writeObject(uc);
    // Close the stream:
    outputStream.flush();
    outputStream.close();
  }

  void readData() throws IOException, ClassNotFoundException {
    // (5)
    // Set up the input streams:
    FileInputStream inputFile = new FileInputStream("storage.dat");
    ObjectInputStream inputStream = new ObjectInputStream(inputFile);
    // Read data.
    Unicycle uc = (Unicycle) inputStream.readObject();
    // Write data on standard output stream.
    System.out.println("After reading: " + uc);
    // Close the stream.
    inputStream.close();
  }
}