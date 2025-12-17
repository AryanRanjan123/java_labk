package Day3;

import java.util.Scanner;

class Plate {
    int length, width;

    Plate(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor called");
        System.out.println("Length = " + length + ", Width = " + width);
    }
}

class Box extends Plate {
    int height;

    Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
        System.out.println("Box constructor called");
        System.out.println("Height = " + height);
    }
}


class WoodBox extends Box {
    int thick;

    WoodBox(int length, int width, int height, int thick) {
        super(length, width, height);
        this.thick = thick;
        System.out.println("WoodBox constructor called");
        System.out.println("Thickness = " + thick);
    }
}


public class WoodBoxDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimensions");

        System.out.print("Length: ");
        int length = sc.nextInt();

        System.out.print("Width: ");
        int width = sc.nextInt();

        System.out.print("Height: ");
        int height = sc.nextInt();

        System.out.print("Thickness: ");
        int thick = sc.nextInt();

        WoodBox wb = new WoodBox(length, width, height, thick);

        sc.close();
    }
}
