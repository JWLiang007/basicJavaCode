public class VariableType {
	public static void main (String[] args){
		
		/* 8 basic variable type totally */
		
		boolean boolVar = true;	// value should be either true or false
		char charVar = 'c';		/* 16bit-length
								** '\u0000' - Unicode escape form
								** - transferred before resolving："\u0022+\u0022" ==> ""+""
								** - checked in comment: // \u0000 
								*/
		byte byteVar = -27;
		short shortVar = -215;
		int intVar = -231;
		long longVar = -263l;	// L-suffix is necessary for long variable
		float floatVar = -0.32f;	// f-suffix is necessary for float variable
		double doubleVar = -0.64d;	// equivalent to = -0.64 
	}	
}