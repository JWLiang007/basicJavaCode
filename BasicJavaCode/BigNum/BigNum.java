import java.math.*;

public class BigNum {
	
	public static void main(String[] args){
		
		BigInteger bigInt = BigInteger.valueOf(10);
		
		BigDecimal bigDec = BigDecimal.valueOf(10.0);
		
		// param of the method should only be BigInteger type
		bigInt = bigInt.add(bigInt);
		// param of the method should only be BigDecimal type
		bigDec = bigDec.multiply(bigDec);
		
		System.out.print(bigInt + "\n" + bigDec);
	}
}