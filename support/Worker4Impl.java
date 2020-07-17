package support;

public class Worker4Impl implements Worker4{
	
	private String position;
	private double salary;
	
	public Worker4Impl(String position, double salary) {
		this.position = position;
		this.salary = salary;
	}
	
	public String getPosition() {
		return position;
	}
	
	public double getSalary() {
		return salary;
	}
}
