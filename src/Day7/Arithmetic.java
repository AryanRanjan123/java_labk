package Day7;

public class Arithmetic {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
