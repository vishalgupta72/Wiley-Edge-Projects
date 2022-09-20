
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address addresses[] = new Address[2];
		
		addresses[0] = new Address("S65/170", "Blue Ridge", "Sunder Nagar", "Indore, Madhya Pradesh");
		
		addresses[1] = new Address("K-131", "The Millenial", "Kalpana Nagar", "Varanasi, Uttar Pradesh");
		
		Employee employee = new Employee("E101","Himanshu Mishra",addresses);
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		
		
		
		System.out.println("==== Temporary Address ====");
		System.out.println(employee.getEmpAddress()[0]);
		
		System.out.println("==== Permanent Address ====");
		System.out.println(employee.getEmpAddress()[1]);


	}

}
