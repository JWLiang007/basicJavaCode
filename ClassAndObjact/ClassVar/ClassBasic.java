/*
	key words:
		new; null; factory method; mutator method; accessor method; 
*/

import java.time.LocalDate;
import java.util.Date;

public class ClassBasic{
	
	public static void main(String[] args){
		
		// | Date today | not initializing will cause compile error
		Date today_1 = new Date();
		// (after setting today = null) today.toString() will cause runtime error
		today_1 = null;
		
		// factory method: substitude for constructor - new LocalDate()
		// Usage scenario: 
		//	1) constructor name needs to be different from class name
		//  2) constructor should return instance of child class
		LocalDate today_2 = LocalDate.now();
		
		// mutator method - object state changed after calling

		// accessor method - object state unchanged after calling  
		
		// return mutated object and original object stands still
		LocalDate aThousandDaysLater = today_2.plusDays(1000);
	}
}