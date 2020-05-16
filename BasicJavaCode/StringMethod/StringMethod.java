public class StringMethod {
	public static void main (String[] args){
		/**
			String feature:
			immutable;
			shared in a String pool;
		*/
		
		String s_1 = "This is a string.";	
		
		// s_2 = s_1[0] to s_1[2]
		String s_2 = s_1.substring(0,3);	
		
		// s_3 = s_1/s_2
		String s_3 = String.join("/",s_1,s_2);	
		
		// s_1 points to another string rather than modifies original string
		s_1 = "This is another string.";	
		
		// never use s_1 == s_2; s_1.substring(0,3) == "Thi" ==> false
		s_1.equals(s_2);

		// empty string & null string 
		// null -> empty
		if (s_1 != null && s_1.length() != 0)
		
		/* 
			length of string 
			note: one code point = two code unit
		*/
		// from perspective of code unit 
		s_1.length();
		// from perspective of code point 
		s_1.codePointCount(0,s_1.length());
		
		// string builder: concatenate substring before construction (more efficient)
		StringBuilder builder = new StringBuilder();
		// .append() 's param can be String、char
		builder.append(s_1);
		// construct string from string builder
		String s_4 = builder.toString();
		
		
		
		System.out.println(s_4);
	}
}