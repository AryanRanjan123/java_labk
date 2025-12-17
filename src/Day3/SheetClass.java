package Day3;

import java.util.Scanner;

class Plastic2D {
    double length, breadth;
    static final int COST_PER_SQFT = 40;

    void getDimensions(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculateCost() {
        return length * breadth * COST_PER_SQFT;
    }
}

class Plastic3D extends Plastic2D {
    double height;
    static final int COST_PER_CUBICFT = 60;

    void getDimensions(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }


    double calculateCost() {
        return length * breadth * height * COST_PER_CUBICFT;
    }
}

public class SheetClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for 2D Sheet or 2 for 3D Box:");
        int choice = sc.nextInt();

        if (choice == 1) {
            Plastic2D sheet = new Plastic2D();
            System.out.print("Enter length and breadth: ");
            sheet.getDimensions(sc.nextDouble(), sc.nextDouble());
            System.out.println("Cost of plastic sheet: Rs " + sheet.calculateCost());
        }
        else if (choice == 2) {
            Plastic3D box = new Plastic3D();
            System.out.print("Enter length, breadth and height: ");
            box.getDimensions(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            System.out.println("Cost of plastic box: Rs " + box.calculateCost());
        }
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
