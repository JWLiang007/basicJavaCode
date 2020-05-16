/*
	key word: 
		final; instance.clone(); class method's access priviledge; this; 
		static; 
*/

import java.time.LocalDate;

public class Employee{
	
	// final descriptor - used in immutable class in which methods don't mutate instance field;
	//  final variable - once assigned, it invokes to the instance till the end
	//  'pointer' is unchangable -- instance is changable
	private final String name;
	
	// static descriptor - all instances share one static field (class field)
	//  it belongs to class rather than instance
	private static int nextId = 1;
	
	private int id;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String n, double s, int year, int month, int day){
		name = n;
		salary = s;
		hireDay = LocalDate.of(year,month,day);
	}
	
	public String getName(){
		return name;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(){
		id = nextId;
		nextId++;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public LocalDate getHireDay(){
		
		// Warnning！returning a mutable instance is not advocated
		//  such as class | Date | including mutator methods
		// using | return hireDay.clone() | to return copy of instance 
		//	rather than 'pointer' that invokes the instance
		//	to avoid private instance field being modified without using mutator method
		return hireDay;
	}
	
	public boolean equals(Employee other){
		
		// private instance field can be accessed by class method 
		// 	which means one instance's private instance field (other.name) can be accessed
		//	by another's method (this.equals())
		return name.equals(other.name)
	}
	
	public void raiseSalary(double byPercent){
		// with implicit parameter: instance name
		// this.salary = ...  - explicit declaration
		//	which is better - seperate instance field from local parameter
		salary = salary * ( 1 + byPercent / 100 );
		
	}
	

	
	
}