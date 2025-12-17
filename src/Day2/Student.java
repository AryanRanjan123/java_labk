package Day2;

import java.util.Scanner;

class Student {

    int roll;
    String name;
    double cgpa;

    // method to read student details
    void read(Scanner sc) {
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }

    // method to display student details
    void display() {
        System.out.println(roll + "\t" + name + "\t" + cgpa);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        // read details
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            s[i] = new Student();
            s[i].read(sc);
        }

        // find student with lowest CGPA
        int lowIndex = 0;
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < s[lowIndex].cgpa) {
                lowIndex = i;
            }
        }

        // display all students
        System.out.println("\nRoll\tName\tCGPA");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }

        // display student with lowest CGPA
        System.out.println("\nStudent with lowest CGPA: " + s[lowIndex].name);

        sc.close();
    }
}