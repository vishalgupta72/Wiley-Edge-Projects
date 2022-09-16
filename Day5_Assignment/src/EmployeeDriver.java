
public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] empArr = new Employee[5];
		
		empArr[0] = new Employee(101, "Rahul", "Information Technology", 35000);
		empArr[1] = new Employee(102, "Deepak", "Accounting", 30000);
		empArr[2] = new Employee(103, "Umesh", "Marketing", 25000);
		empArr[3] = new Employee(104, "Vishal", "Information Technology", 45000);
		empArr[4] = new Employee(105, "Praveen", "Information Technology", 50000);

		Employee.searchEmployees(empArr, "Marketing");
		
		if(empArr[0].equals(empArr[2])) {
			System.out.println("Both are same employees!");
		}
		else {
			System.out.println("Both are different employees!");			
		}
		
		if(empArr[0].equals(empArr[1])) {
			System.out.println("Both are same employees!");
		}
		else {
			System.out.println("Both are different employees!");			
		}
		
		Employee.sortEmployees(empArr);
		
		for(Employee emp: empArr)
			System.out.println(emp.getDetails());
		}

}
