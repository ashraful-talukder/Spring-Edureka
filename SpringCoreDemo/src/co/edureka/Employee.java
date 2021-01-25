package co.edureka;


//Bean or Model or POJO
public class Employee {

	//attributes
	
	int eid;
	String ename;
	String eaddress;
	
	//methods
	
	public Employee() {
		
	}
	
	public Employee(int eid, String ename, String eaddress) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + "]";
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
	
	public String getEaddress() {
		return eaddress;
	}
	
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	

}
