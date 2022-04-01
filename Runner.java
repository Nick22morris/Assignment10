
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee bossMan = new SalariedEmployee("Mr. Bossman",2001, 40000.00);
		Employee poorManWeHate = new HourlyEmployee("Mr. noWorkersRights",2001,8.0,38.0);
		Employee poorManWeLove = new OvertimeHourlyEmployee("Jose",2001,8.0,70.0);
		System.out.println(bossMan);
		System.out.println(poorManWeHate);
		System.out.println(poorManWeLove);
	}

}
