public class EmployeeTest{
		
	public static void main(String[] args){
		
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Carl Cracker", 8500.9, 2019, 7, 10);
		staff[1] = new Employee("Harry Hacker", 9000.6, 2019, 7, 15);
		staff[2] = new Employee("Tony Tester", 10000.9, 2019, 7, 20);
		
		for (Employee s : staff){
			System.out.println(s.getName() + "\t\t" + s.getSalary() + "\t\t" + s.getHireDay());
		}
		
		for (Employee s : staff){
			s.raiseSalary(5);
		}
		
		for (Employee s : staff){
			System.out.println(s.getName() + "\t\t" + s.getSalary() + "\t\t" + s.getHireDay());
		}
		
	}
}