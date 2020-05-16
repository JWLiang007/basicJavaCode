import java.util.Scanner;
import java.io.Console;
import java.nio.file.Paths;
import java.io.PrintWriter;

public class InputAndOutput {
	public static void main (String[] args) throws IOException {
		/*
			input
		*/
		
		// class Scanner is necessary
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.println(input);
		
		// class Console is used for password && console
		Console cons = System.console();
		// char array is safer than string
		char[] passwd = cons.readPassword("Password: ");
		System.out.println(passwd);
		
		/*
			output
		*/
		
		// formatted output
		System.out.printf("output: %s",input);
		
		/*
			input and output for file
		*/
		in = new Scanner(Paths.get("InputAndOutput.java"),"UTF-8");
		PrintWriter out = new PrintWriter("InputAndOutput.java","UTF-8");
	}
}