package Day5;

import java.util.Scanner;

/* Parent class */
class Manager {
    double basic;

    Manager(double basic) {
        this.basic = basic;
    }

    void earnings() {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        System.out.println("Earnings - " + (basic + da + hra));
    }

    void deductions() {
        double pf = 0.12 * basic;
        System.out.println("Deduction - " + pf);
    }
}

/* Child class */
class Substaff extends Manager {

    Substaff(double basic) {
        super(basic);   // super() MUST be first
    }

    void bonus() {
        double bonus = 0.5 * basic;
        System.out.println("Bonus - " + bonus);
    }
}

/* Main class */
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Substaff sb = new Substaff(basic);
        sb.earnings();
        sb.deductions();
        sb.bonus();

        sc.close();
    }
}
