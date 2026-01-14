package Day4;

public abstract class AbstractStudent {
    protected int rollNo;
    protected long regNo;

    void getInput(int rollNo, long regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    abstract void course();
}

class Kiitian extends AbstractStudent {

    @Override
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Rollno - " + rollNo);
        System.out.println("Registration no - " + regNo);
        course();
    }
}

class AbstractDemo {
    public static void main(String[] args) {

        Kiitian k = new Kiitian();

        // Input
        k.getInput(2205180, 1234567890L);

        // Output
        k.display();
    }
}
