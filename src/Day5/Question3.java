package Day5;

import java.util.Scanner;

/* Interface */
interface SalaryQ3 {
    void earnings();
    void deductions();
    void bonus();
}

/* Abstract class */
abstract class ManagerQ3 implements SalaryQ3 {
    double basic;

    ManagerQ3(double basic) {
        this.basic = basic;
    }

    public void earnings() {
        double DA = 0.8 * basic;
        double HRA = 0.15 * basic;
        System.out.println("Earnings = " + (basic + DA + HRA));
    }

    public void deductions() {
        double PF = 0.12 * basic;
        System.out.println("Deductions = " + PF);
    }
}

/* Sub class */
class SubstaffQ3 extends ManagerQ3 {

    SubstaffQ3(double basic) {
        super(basic);
    }

    public void bonus() {
        double bonus = 0.5 * basic;
        System.out.println("Bonus = " + bonus);
    }
}

/* Main class */
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        SubstaffQ3 s = new SubstaffQ3(basic);
        s.earnings();
        s.deductions();
        s.bonus();

        sc.close();
    }
}
