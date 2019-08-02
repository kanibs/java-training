public class StringConstruction {
static String str1 = "You cannot change me!";
// Interned
public static void main(String[] args) {
String emptyStr = new String();
// ""
System.out.println("emptyStr: \"" + emptyStr + "\"");
String str2 = "You cannot change me!";
String str3 = "You cannot" + " change me!";
String str4 = new String("You cannot change me!");
String words = " change me!";
String str5 = "You cannot" + words;
System.out.println("str1 == str2: " + (str1 == str2));
System.out.println("str1.equals(str2): " + str1.equals(str2));


System.out.println("str1 == str3:" + (str1 == str3));
System.out.println("str1.equals(str3): " + str1.equals(str3)); 

System.out.println("str1 == str4: " + (str1 == str4));
System.out.println("str1.equals(str4): " + str1.equals(str4));

System.out.println("str1 == str5:" + (str1 == str5));
System.out.println("str1.equals(str5): " + str1.equals(str5));

System.out.println("str1 == Auxiliary.str1: " +(str1 == Auxiliary.str1));

System.out.println("str1.equals(Auxiliary.str1): " + str1.equals(Auxiliary.str1));

System.out.println("\"You cannot change me!\".length(): " + "You cannot change me!".length());

}
}
class Auxiliary {
static String str1 = "You cannot change me!";
}