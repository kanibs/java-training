import java.util.Scanner;
public class UserInput{

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 2; i++) {
      System.out.println("Enter a word");
      String line = sc.nextLine();
      System.out.println("You entered :" + line);
    }

  }
}