public class Average1 {
public static void main(String[] args) {
	printAverage(100, 0);
	System.out.println("Exit main().");
}

public static void printAverage(int totalSum, int totalNumber) {
	int average = computeAverage(totalSum, totalNumber); 
	System.out.println("Average = " + totalSum + " / " + totalNumber + " = " + average);
	System.out.println("Exit printAverage().");

}
public static int computeAverage(int sum, int number) {
	System.out.println("Computing average.");

	return sum/number;

}
}
