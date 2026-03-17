package Day6;

class Bank {

    double balance = 50000;

    static class InterestCalculator {

        static double calculateSimpleInterest(double principal, double rate, double time) {
            return (principal * rate * time) / 100;
        }

    }
    public static void main(String[] args) {

        double si = Bank.InterestCalculator.calculateSimpleInterest(10000, 5, 2);

        System.out.println("Simple Interest = " + si);
    }
}
