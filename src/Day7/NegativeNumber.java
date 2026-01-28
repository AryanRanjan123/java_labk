package Day7;

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super();
    }
}

public class NegativeNumber {

    void ProcessInput(int num) throws NegativeNumberException {

        if (num < 0) {
            throw new NegativeNumberException();
        } else {
            System.out.println("Double value: " + (num * 2));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NegativeNumber obj = new NegativeNumber();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            obj.ProcessInput(num);
        }
        catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
        }
    }
}
