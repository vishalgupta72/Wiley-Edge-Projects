
public class Employee {
	
	private int empId;
	private String empName, empDept;
	private double empBasicSalary, empGrossSalary;
	public Employee(int empId, String empName, String empDept, double empBasicSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public double calculateGrossSalary() {
		empGrossSalary = empBasicSalary + (0.12*empBasicSalary) + (0.08*empBasicSalary);
		return empGrossSalary;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}
	
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public double getEmpBasicSalary() {
		return empBasicSalary;
	}

	public double getEmpGrossSalary() {
		return this.calculateGrossSalary();
	}


	public static void searchEmployees(Employee[] empArr, String dept) {
		
		System.out.println("Employees who work in "+dept+" department: ");
		for(Employee emp: empArr) {
			if(emp.empDept.equals(dept)) {
				System.out.println(emp.getDetails());
			}
		}
	}
	
	
	public static Employee[] sortEmployees(Employee[] empArr) {
		int n = empArr.length;
		Employee temp;
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < (n-i); j++) {
				double a = empArr[j-1].getEmpGrossSalary();
				double b = empArr[j].getEmpGrossSalary();
				
				if(a > b) {
					temp = empArr[j-1];
					empArr[j-1] = empArr[j];
					empArr[j] = temp;
				}
			}
		}
		
		return empArr;
	}
	/*public static Pair[] sortEmployees(Employee employees[]) {
		
		int i;
		Pair pairs[] = new Pair[5];
		
		for(i=0;i<5;++i) {
			pairs[i] = new Pair(employees[i].getEmpName(), employees[i].calculateGrossSalary());
		}
		
		Arrays.sort(pairs, new Sort());
	
		return pairs;
	}*/

	public String getDetails() {
		// TODO Auto-generated method stub
		return ("Employee ID: "+empId+", Name: "+empName+", Department: "+empDept+", Basic Salary: "+empBasicSalary+", Gross Salary: "+this.getEmpGrossSalary());
	}
	
}

/*
 * class Pair { private String name; private double salary;
 * 
 * public Pair(String name, double salary) { this.name = name; this.salary =
 * salary; }
 * 
 * public String getName() { return this.name; }
 * 
 * public double getSalary() { return this.salary; } }
 * 
 * class Sort implements Comparator <Pair>{
 * 
 * @Override public int compare(Pair pair1, Pair pair2) { return
 * (int)(pair1.getSalary() - pair2.getSalary()); }
 * 
 * }
 */
