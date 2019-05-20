import java.util.Scanner;
class TestNegativeException{


	 public static void main(String[] args) throws NegativeAgeException{
	    Scanner sc = new Scanner(System.in);
    	System.out.println("Enter some Age");
      	int age = Integer.parseInt(sc.nextLine());
      	if(age < 0 ){
      		throw new NegativeAgeException();
      	}

	}
}