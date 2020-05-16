public class ControlFlow {
	
	public static void main(String[] args){
		
		// if statement
		
		// while statement
		
		// do..while statement
		// ';' is necessary after while statement
		do {
			break;
		}while(true);
		
		// for statement
		// support for each loop
		// 	collection should be array or class object that implements Iterable interface
		int[] intArray = new int[10];
		for (int element:intArray)	
		
		// switch statement
		// switch Var or case tag should be type of
		// 	char、byte、short、int or enum 
		switch (1){
			case 1:
				break;
			default:
				break;
		}
		
		// break label
		label:
		{
			break label;
		}
		// jump here when the break statement executes
	}
}