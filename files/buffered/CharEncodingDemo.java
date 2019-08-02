import java.io.*;


class CharEncodingDemo {
  public static void main(String[] args) throws IOException, NumberFormatException {
    // Character encoding.
    FileOutputStream outputFile = new FileOutputStream("info.txt");
    OutputStreamWriter writer = new OutputStreamWriter(outputFile, "8859_1");
    BufferedWriter bufferedWriter1 = new BufferedWriter(writer);
    PrintWriter printWriter = new PrintWriter(bufferedWriter1, true);
    System.out.println("Writing using encoding: " + writer.getEncoding());
    // Print Java primitive values, one on each line.
    printWriter.println(true);
    printWriter.println('A');
    printWriter.println(Byte.MAX_VALUE);
    printWriter.println(Short.MIN_VALUE);
    printWriter.println(Integer.MAX_VALUE);
    printWriter.println(Long.MIN_VALUE);
    printWriter.println(Float.MAX_VALUE);
    printWriter.println(Math.PI);
    printWriter.flush();
    printWriter.close();

    FileInputStream inputFile = new FileInputStream("info.txt");
    InputStreamReader reader = new InputStreamReader(inputFile, "8859_1");
    BufferedReader bufferedReader = new BufferedReader(reader);
    System.out.println("Reading using encoding: " + reader.getEncoding());
    boolean v = bufferedReader.readLine().equals("true") ? true : false;
    char c = bufferedReader.readLine().charAt(0);
    byte b = (byte) Integer.parseInt(bufferedReader.readLine());
    short s = (short) Integer.parseInt(bufferedReader.readLine());
    int i = Integer.parseInt(bufferedReader.readLine());
    long l = Long.parseLong(bufferedReader.readLine());
    float f = Float.parseFloat(bufferedReader.readLine());
    double d = Double.parseDouble(bufferedReader.readLine());
    // Check for end of stream:
    String line = bufferedReader.readLine();
    if (line != null) {
      System.out.println("More input: " + line);
    } else {
      System.out.println("End of stream");
    }
    bufferedReader.close();
    System.out.println("Values read:");
    System.out.println(v);
    System.out.println(c);
    System.out.println(b);
    System.out.println(s);
    System.out.println(i);
    System.out.println(l);
    System.out.println(f);
    System.out.println(d);
  }
}