import java.util.Arrays;

public class ArrayC{
	
	public static void main(String[] args){
		
		// Note:
		// length = 0 not equal to null
		// element type should be one of the eight basic types
		
		int[] intArray_1 = new int[10];
		
		// initialization
		int[] intArray_2 = {1,2,3};
		// anonymous array
		intArray_1 = new int[] {4,5,6};
		
		// copy 
		// intArray_1 and intArray_3 invoke the same array
		int[] intArray_3 = intArray_1;
		// copy values from one to another
		intArray_3 = Arrays.copyOf(intArray_2,intArray_2.length);
		
		// sorting the array
		Arrays.sort(intArray_1);
		
		// a good way to print all array element
		System.out.print(Arrays.toString(intArray_1) + Arrays.toString(intArray_3));
		
		// command line parameter 
		// 	print the first cmd parameter
		System.out.print(args[0]);
		
		// multi-dimension array
		int[][] twoDimsArray = {{1,2,3},{4,5,6},{7,8,9}};
		// twoDimsArray = {{1,2,3},{4,5,6},{7,8,9}};
		// for-each recycle for 2-dimension array
		for(int[] row:twoDimsArray)
			for(int value:row);
		// a good way to print 2-dimension array
		System.out.println(Arrays.deepToString(twoDimsArray));
		
		// irregular array - each row has different number of elements
		// 	| int[0] twoDimsArray | can be seen as a pointer that invokes a subarray 
		// num of elements for each row should not be specified in the definition of irregular array
		int[][] irregularArray = new int[3][];
	}
}