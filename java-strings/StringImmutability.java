public class StringImmutability {

  public static void main(String[] args) {

    String s = "abc";
    s = s.concat("def"); //Here "abc" is lost and we have only access to abcdef
    System.out.println(s);

    String x = "Java";
    x.concat("rocks");  //The String here is lost. We just cannot access it
    System.out.println(x);

    String y = "Java Rules!";
    y.toUpperCase();
	System.out.println(y);    
  }
}
