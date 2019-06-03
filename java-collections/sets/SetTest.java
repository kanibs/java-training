import java.util.*;


class SetTest {
  public static void main(String[] args) {
    boolean[] ba = new boolean[6];
    Set s = new HashSet();
    ba[0] = s.add("a");
    ba[1] = s.add(new Integer(42));
    ba[2] = s.add("b");
    ba[3] = s.add("a");
    ba[4] = s.add(new Object());
    ba[5] = s.add(new Object());
    for (int x = 0; x < ba.length; x++)
      System.out.print(ba[x] + " ");
    System.out.println("\n");

    System.out.println("Using enhanced for loop to print the elements");    
    for (Object o : s)
      System.out.print(o + " ");
  }
}
