/*
	key word: 
		final; 
		instance.clone(); 
		class method's access priviledge; 
		this; 
		static; 
		static constant; 
		static method;
		constructor;
		initialization block;
		constructor order;
*/

import java.time.LocalDate;

public class Employee{
	
	// final descriptor - used in immutable class in which methods don't mutate instance field;
	//  final variable - once assigned, it invokes to the instance till the end
	//  'pointer' is unchangable -- instance is changable
	private final String name;
	
	// static descriptor - all instances share one static field (class field)
	//  it belongs to class rather than instance
	//
	// explicit initialization - not confined to be constant but method
	private static int nextId = 1;
	
	// static constant
	//  can be set as public, bacause it's final and has been assigned
	public static final double PI = 3.14;
	
	private int id;
	private double salary;
	private LocalDate hireDay;
	
	/*
		constructor order:
			1) all instance fields are initialized to be default values;
			2) execute initialization statements and initialization blocks in order
			3) if another constructor is embedded into the constructor, run that constructor
			4) run the rest of the constructor
	*/
	
	// initialization blocks run before constructor
	{
		// initialization block
	}
	
	// static initialization blocks - for static field
	static {
		// static initialization block
	}
	
	// a constructor can call another constructor for initialization
	public Employee(){
		this("aName", 0, 2019, 7, 15);
	}
	
	// Only if no constructor is defined, a constructor without parameter will be provided
	//  so it would be better if a explicit constructor without parameter is provided
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
	
	// static method - class method - className.method()
	//  it can only access static field and doesn't have implicit parameter (this)
	public static int getNextId(){
		return nextId;
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
		return name.equals(other.name);
	}
	
	public void raiseSalary(double byPercent){
		// with implicit parameter: instance name
		// this.salary = ...  - explicit declaration
		//	which is better - seperate instance field from local parameter
		salary = salary * ( 1 + byPercent / 100 );
		
	}
	
}