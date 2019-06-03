interface IStack {
  
  void push(Object item);

  Object pop();
}


// ______________________________________________________________________________
class StackImpl implements IStack {
  
  protected Object[] stackArray;
  protected int tos; // top of stack

  public StackImpl(int capacity) {
    stackArray = new Object[capacity];
    tos = -1;
  }

  public void push(Object item) {
    stackArray[++tos] = item;
  } 

  public Object pop() {
    Object objRef = stackArray[tos];
    stackArray[tos] = null;
    tos--;
    return objRef;
  } 

  public Object peek() {
    return stackArray[tos];
  }
}


// ______________________________________________________________________________
interface ISafeStack extends IStack {
  
  boolean isEmpty();

  boolean isFull();
}


// ______________________________________________________________________________
class SafeStackImpl extends StackImpl implements ISafeStack {

  public SafeStackImpl(int capacity) {
    super(capacity);
  }

  public boolean isEmpty() {
    return tos < 0;
  }


  public boolean isFull() {
    return tos >= stackArray.length - 1;
  }
}


// ______________________________________________________________________________
public class StackUser {
  public static void main(String[] args) {
    SafeStackImpl safeStackRef = new SafeStackImpl(10);
    StackImpl stackRef = safeStackRef;
    ISafeStack isafeStackRef = safeStackRef;
    IStack istackRef = safeStackRef;
    Object objRef = safeStackRef;
    safeStackRef.push("Dollars");
    stackRef.push("Kroner");
    System.out.println(isafeStackRef.pop());
    System.out.println(istackRef.pop());
    System.out.println(objRef.getClass());
  }
}
