/*
	key word: 
		call by value; 

*/

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
		
		for (Employee s : staff){
			tripleSalary(s);
		}
		
		for (Employee s : staff){
			System.out.println(s.getName() + "\t\t" + s.getSalary() + "\t\t" + s.getHireDay());
		}		
	}
	
	// call by value (not reference):
	// method | public void plusOne(int x) | can't mutate the value x after calling,
	//  but method with class instance as parameter can modify instance field of the parameter
	//  when calling the mutator method
	// 
	// Note:
	//   public void exchange(className a, className b){
	//		className tmp = a;
	//		a = b;
	//		b = tmp;
	//   }
	//  doesn't work because the parameter ifself is a copy of class variable, 
	//	variable won't change after calling the method, but we can call class method of 
	//  class instance the variable invokes
	public static void tripleSalary(Employee e){
		
		e.raiseSalary(200);
	}
}