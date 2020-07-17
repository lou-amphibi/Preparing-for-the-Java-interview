package support;

public class Worker2Impl implements Worker2{

	String name;
	int points;
	
	public Worker2Impl(String name, int points) {
		this.name = name;
		this.points = points;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPoints() {
		return points;
	}
}
