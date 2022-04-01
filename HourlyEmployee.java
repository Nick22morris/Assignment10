public class HourlyEmployee extends Employee{
	private double hourlyWage;
	private double hoursWorked;
	
	HourlyEmployee(String name, int yearJoined, double hourlyWage, double hoursWorked) {
		super(name, yearJoined);
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void work(double hours) {
		hoursWorked += hours;
	}
	public double computeWeeklyPay() {
		return hourlyWage * hoursWorked;
	}
	public String toString() {
		return super.toString() + "hoursWorked=" + hoursWorked + "\nhourlyWage="+hourlyWage;
	}
}
