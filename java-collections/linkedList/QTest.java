import java.util.LinkedList;
import java.util.Queue;
class QTest{
  public static void main(String[] args) {
    
    Queue<String> q = new LinkedList<>();
    q.add("a");
    q.add("b");
    q.add("c");
    System.out.println(q.peek());
    System.out.println(q);

    System.out.println(q.poll());
    System.out.println(q);

  }
}
