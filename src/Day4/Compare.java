package Day4;

// Student class
class Student {
    int rollNo;
    String name;

    // Constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Overriding equals() method
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Student s = (Student) obj;

        return rollNo == s.rollNo && name.equals(s.name);
    }
}

// Driver class
public class Compare{
    public static void main(String[] args) {

        Student s1 = new Student(101, "Amit");
        Student s2 = new Student(101, "Amit");

        if (s1.equals(s2)) {
            System.out.println("Both students are equal");
        } else {
            System.out.println("Both students are not equal");
        }
    }
}
