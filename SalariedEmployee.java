
public class SalariedEmployee extends Employee {
	
	private Double yearlySalary;
	
	SalariedEmployee(String name, int yearHired, double yearlySalary) {
		super(name, yearHired);
		this.yearlySalary = yearlySalary;
	}

	public double computeWeeklyPay() {
		return yearlySalary/52;
	}
	public String toString() {
		return super.toString() + "yearlySalary=" + yearlySalary;
	}
}
