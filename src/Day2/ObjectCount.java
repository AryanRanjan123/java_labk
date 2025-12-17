package Day2;

import java.util.Scanner;

class ObjectCount {

    static int count = 0;   // static variable

    ObjectCount() {
        count++;            // increases when object is created
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of objects created: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            new ObjectCount();
        }

        System.out.println("Number of objects created = " + count);

        sc.close();
    }
}
