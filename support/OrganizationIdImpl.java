package support;

public class OrganizationIdImpl implements OrganizationId{
	
	int id;
	
	public OrganizationIdImpl(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

}
