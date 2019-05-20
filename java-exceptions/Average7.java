public class Average7 {
public static void main(String[] args) {
try {
	printAverage(100, 0);
} catch (ArithmeticException ae) {
	ae.printStackTrace();
	System.out.println("Exception handled in main().");
} finally {
	System.out.println("Finally in main().");
}
System.out.println("Exit main().");
}

public static void printAverage(int totalSum, int totalNumber) {
try {

int average = computeAverage(totalSum, totalNumber);

System.out.println("Average = " +totalSum + " / " + totalNumber + " = " + average);
} catch (IllegalArgumentException iae) {

iae.printStackTrace();

System.out.println("Exception handled in printAverage().");
} finally {
System.out.println("Finally in printAverage().");

}
}

public static int computeAverage(int sum, int number) {
	System.out.println("Computing average.");
	return sum/number;
}
}
