package support;

import java.util.LinkedList;
import java.util.List;

public class OrganizationImp implements  Organization{
	
	List<Worker> workers = new LinkedList<>();
	
	public OrganizationImp(List<Worker> workers) {
		this.workers = workers;
	}
	
	public List<Worker> getWorkers() {
		return workers;
	}

}
