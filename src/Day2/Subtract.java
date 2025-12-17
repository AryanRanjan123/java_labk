package Day2;

class SubtractDemo {

    // subtract two integers
    void subtract(int a, int b) {
        System.out.println("Subtraction of two integers = " + (a - b));
    }

    // subtract three integers
    void subtract(int a, int b, int c) {
        System.out.println("Subtraction of three integers = " + (a - b - c));
    }

    // subtract two double values
    void subtract(double a, double b) {
        System.out.println("Subtraction of two doubles = " + (a - b));
    }

    public static void main(String[] args) {

        SubtractDemo obj = new SubtractDemo();

        // calling different subtract methods
        obj.subtract(10, 5);
        obj.subtract(20, 5, 3);
        obj.subtract(15.5, 4.2);
    }
}