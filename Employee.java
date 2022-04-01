
public abstract class Employee {
	private String name;
	private int yearHired;
	
	Employee(String name, int yearHired) {
		this.name = name;
		this.yearHired = yearHired;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearHired() {
		return yearHired;
	}

	public void setYearHired(int yearHired) {
		this.yearHired = yearHired;
	}
	public abstract double computeWeeklyPay();
	@Override
	public String toString() {
		return "Employee: \nname=" + name + "\nyearHired=" + yearHired + "\nWeeklyPay=" + computeWeeklyPay() +"\n";
	}
	
	
}
