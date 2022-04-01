
public class OvertimeHourlyEmployee extends HourlyEmployee{
	
	OvertimeHourlyEmployee(String name, int yearJoined, double hourlyWage, double hoursWorked) {
		super(name, yearJoined, hourlyWage, hoursWorked);
	}
	
	
	public double computeWeeklyPay() {
		if (getHoursWorked() > 40) {
			double extraTime = getHoursWorked() - 40;
			double overTimeMoney = extraTime * getHourlyWage() * 1.5;
			double standardWage = 40 * getHourlyWage();
			return standardWage + overTimeMoney;
		}
		return getHourlyWage() * getHoursWorked();
	} 

}
