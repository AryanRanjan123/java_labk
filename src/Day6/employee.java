package Day6;

public class employee {

    protected int empid;
    private String ename;
    protected double basic;
    protected double earnings;

    public employee(int empid, String ename, double basic) {
        this.empid = empid;
        this.ename = ename;
        this.basic = basic;
    }

    public void earnings() {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        earnings = basic + da + hra;
    }

    public double getEarnings() {
        return earnings;
    }
}
