
public class Employee {
	private String empId;
	private String empName;
	private Address empAddress[];
	
	public Employee(String empId, String empName, Address empAddress[]) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	
	public String getEmpId() {
		return this.empId;
	}
	
	public String getEmpName() {
		return this.empName;
	}
	
	public Address[] getEmpAddress() {
		return this.empAddress;
	}
}