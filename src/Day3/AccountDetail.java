package Day3;

import java.util.Scanner;

// Base class
class Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

// Subclass
class Person extends Account {
    String name;
    long aadhar_no;

    void input(Scanner sc) {
        sc.nextLine(); // clear newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLong();

        super.input(sc);
    }

    @Override
    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.disp();
    }
}

// Main class (file name = AccountDetail.java)
public class AccountDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] p = new Person[3];

        System.out.println("Enter details of three persons");

        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1));
            p[i] = new Person();
            p[i].input(sc);
        }

        System.out.println("\nDisplay details of three persons");

        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1));
            p[i].disp();
        }

        sc.close();
    }
}
