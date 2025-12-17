package Day2;

import java.util.Scanner;

class Rectangle {

    double length;
    double breadth;
    double area;
    double perimeter;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}

class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        Rectangle r = new Rectangle(l, b);
        r.calculate();
        r.display();

        sc.close();
    }
}
