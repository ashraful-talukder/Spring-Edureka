package co.edureka;


//Bean or Model or POJO
public class Employee {

	//attributes
	
	int eid;
	String ename;
	Address eaddress;
	
	//methods
	
	public Employee() {
		
	}
	
	//constructor injection
	public Employee(Address address) {
		eaddress = address;
	}
	
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getEaddress() {
		return eaddress;
	}

	//setter injection
	public void setEaddress(Address eaddress) {
		this.eaddress = eaddress;
	}
	
	
}
