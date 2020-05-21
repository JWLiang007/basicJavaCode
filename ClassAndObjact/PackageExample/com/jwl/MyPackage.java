/* 
	package;
	package scope;
*/

// package the class - can be imported by other code 
//  - import com.jwl.PackageExample;
package com.jwl;

import java.util.*;

// static import - import static field and static method
import static java.lang.System.*;

public class MyPackage{
	
	// variable scope can accessed by methods in the package
	String scope = "package";	
	
	public static void main(String[] args){
		exit(0);	// calling | System.exit() | method
	}
}