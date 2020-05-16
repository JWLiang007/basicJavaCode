public class Operator {
	public static void main (String[] args) {
		int var_1 = -16;
		int var_2 = var_1 >> 1;	// arithmetic shift
		int var_3 = var_1 >>> 1;	// logical shift
		System.out.println("var_1: " + var_1 + 
			"\nvar_2: " + var_2 + "\nvar_3: " + var_3);
	}
}