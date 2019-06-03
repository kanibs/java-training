import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student> {
  String name;
  int rollNumber;

  public Student(String name, int rollNumber) {
    super();
    this.name = name;
    this.rollNumber = rollNumber;
  }

  // @Override
  // public boolean equals(Object obj) {
  //   if (obj instanceof Student) {
  //     Student otherStudent = (Student) obj;
  //     if (this.rollNumber == otherStudent.rollNumber) {
  //       return true;
  //     } else {
  //       return false;
  //     }
  //   }
  //   return false;
  // }

  // @Override
  // public int hashCode() {
  //   return name.hashCode() + rollNumber;
  // }

  @Override
  public String toString() {
    return name + ":" + rollNumber;
  }

  @Override
  public int compareTo(Student o) {
    if (this.rollNumber < o.rollNumber)
      return -1;
    if (this.rollNumber == o.rollNumber)
      return 0;

    return 1;
  }


}

class StudentsWithComparable{
	public static void main(String[] args) {
	Set<Student> students = new TreeSet();
    students.add(new Student("Bob", 3));
    students.add(new Student("Sally", 23));
    students.add(new Student("Amy", 46));
    students.add(new Student("Amy", 46));
    System.out.println(students);

    Student bob = new Student("Bob", 3);
    System.out.println("Set has Bob?"+students.contains(bob));
	}
}