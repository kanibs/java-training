import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable{

	String name;
	int rollNo;

	Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}

	public int compareTo(Object other){
		Student otherStudent = null;
		if(other instanceof Student){
			otherStudent = (Student) other;
		}
		return this.name.compareTo(otherStudent.name);

	}

	public String toString(){
		return "["+this.name+","+this.rollNo+"]";
	}
}

public class StudentsSorter{

	public static void main(String[] args) {
		List students =  new ArrayList();

		Student jane = new Student("Jane", 1);
		Student sally = new Student("Sally", 2);
		Student amy = new Student("Amy", 3);

		students.add(jane);
		students.add(sally);
		students.add(amy);
		System.out.println(students);

		Collections.sort(students);
		System.out.println(students);

	}
}