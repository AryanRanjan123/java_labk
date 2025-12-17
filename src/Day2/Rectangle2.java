package Day2;

import java.util.Scanner;

public class Rectangle2 {

    double length, breadth;

    // Default constructor
    Rectangle2() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    Rectangle2(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle2 r1 = new Rectangle2();
        System.out.println("Using Default Constructor:");
        r1.area();

        System.out.print("\nEnter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        Rectangle2 r2 = new Rectangle2(l, b);
        System.out.println("Using Parameterized Constructor:");
        r2.area();

        sc.close();
    }
}
