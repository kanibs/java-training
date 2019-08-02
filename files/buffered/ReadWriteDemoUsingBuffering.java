import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteDemoUsingBuffering {

  public static void main(String[] args) throws IOException {

    // Writing to a file.

    BufferedWriter writer = new BufferedWriter(new FileWriter(new File("demo.txt")));
    writer.write("This is line 1");
    writer.newLine();
    //If you pass any int(as shown below) then it gets converted to a corresponding UNICODE character. Since Java by-default uses 
    //UNICODE characters
    writer.write(0102); 
    writer.newLine();
    writer.write("Last line");
    writer.close();


    BufferedReader reader = new BufferedReader(new FileReader(new File("demo.txt")));

    String line = "";
    while ((line = reader.readLine()) != null) {
      System.out.println(line);
    }
    reader.close();

  }
}
