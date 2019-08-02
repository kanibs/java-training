import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;


class ObjectSerializationDemo {
  void writeData() {
    // (1)
    try {
      // Set up the output stream:
      FileOutputStream outputFile = new FileOutputStream("obj-storage.dat");
      ObjectOutputStream outputStream = new ObjectOutputStream(outputFile);
      // Write data:
      String[] strArray = {"Seven", "Eight", "Six"};
      long num = 2008;
      int[] intArray = {1, 3, 1949};
      String commonStr = strArray[2];
      outputStream.writeObject(strArray);
      outputStream.writeLong(num);
      outputStream.writeObject(intArray);
      outputStream.writeObject(commonStr);
      // "Six"
      // Flush and close the output stream:
      outputStream.flush();
      outputStream.close();
    } catch (FileNotFoundException e) {
      System.err.println("File not found: " + e);
    } catch (IOException e) {
      System.err.println("Write error: " + e);
    }
  }

  void readData() throws Exception {
    // (2)
    try {
      // Set up the input stream:
      FileInputStream inputFile = new FileInputStream("obj-storage.dat");
      ObjectInputStream inputStream = new ObjectInputStream(inputFile);
      // Read the data:
      String[] strArray = (String[]) inputStream.readObject();
      long num = inputStream.readLong();
      int[] intArray = (int[]) inputStream.readObject();
      String commonStr = (String) inputStream.readObject();
      // Write data to the standard output stream:
      System.out.println(Arrays.toString(strArray));
      System.out.println(Arrays.toString(intArray));
      System.out.println(commonStr);
      inputStream.close();
    }
    // Close the stream:
    catch (

    FileNotFoundException e) {
    }
  }

  public static void main(String[] args) throws Exception {
    ObjectSerializationDemo demo = new ObjectSerializationDemo();
    demo.writeData();
    demo.readData();
  }
}
