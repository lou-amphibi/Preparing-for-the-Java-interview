package support;

public class WorkerImpl implements Worker{
	String name;
	
	public WorkerImpl(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
