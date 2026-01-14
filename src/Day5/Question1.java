package Day5;

interface motor {
    int capacity = 156;
    void run();
    void consume();
}

class WashingMachine implements motor {

    public void run() {
        System.out.println("Motor is Running");
    }

    public void consume() {
        System.out.println("Motor is consuming power");
    }

    void showCapacity() {
        System.out.println("Capacity = " + capacity);
    }
}

public class Question1 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        wm.showCapacity();
    }
}
