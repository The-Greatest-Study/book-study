package practice05;

public class Salesman extends Employee{

    public Salesman(int _monthlySalary, int _commission, int _bonus) {
        super(_monthlySalary, _commission, _bonus);
    }

    public int payAmount() {
        return this.get_monthlySalary() + this.get_commission();
    }
}
