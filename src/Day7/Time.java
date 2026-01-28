package Day7;

import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String msg) {
        super(msg);
    }
}

class MinException extends Exception {
    public MinException(String msg) {
        super(msg);
    }
}

class SecException extends Exception {
    public SecException(String msg) {
        super(msg);
    }
}

public class Time {

    int hours, minutes, seconds;

    void getTime() throws HrsException, MinException, SecException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        hours = sc.nextInt();

        if (hours > 24 || hours < 0) {
            throw new HrsException("hour is not greater than 24");
        }

        System.out.print("Enter minutes: ");
        minutes = sc.nextInt();

        if (minutes > 60 || minutes < 0) {
            throw new MinException("hour is not greater than 60");
        }

        System.out.print("Enter seconds: ");
        seconds = sc.nextInt();

        if (seconds > 60 || seconds < 0) {
            throw new SecException("hour is not greater than 60");
        }

        System.out.println("Correct Time-> " + hours + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) {

        Time t = new Time();

        try {
            t.getTime();
        }
        catch (HrsException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidHourException:" + e.getMessage());
        }
        catch (MinException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidMinuteException:" + e.getMessage());
        }
        catch (SecException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: InvalidSecondException:" + e.getMessage());
        }
    }
}
