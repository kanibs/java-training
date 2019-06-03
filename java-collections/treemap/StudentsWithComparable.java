import java.util.*;

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
  // if (obj instanceof Student) {
  // Student otherStudent = (Student) obj;
  // if (this.rollNumber == otherStudent.rollNumber) {
  // return true;
  // } else {
  // return false;
  // }
  // }
  // return false;
  // }

  // @Override
  // public int hashCode() {
  // return name.hashCode() + rollNumber;
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


class StudentsWithComparable {
  public static void main(String[] args) {
    Map<Student, Integer> students = new TreeMap<>();
    students.put(new Student("Bob", 3), 30);
    students.put(new Student("Sally", 23), 79);
    students.put(new Student("Amy", 1), 97);
    System.out.println(students);

  }
}
