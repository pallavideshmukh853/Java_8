package lambdaquestion3;
//User will be asked to enter two integer like 1 34 or 2 44 or 3 151 or 4 
//454. 1 to check given no is even, 2 for odd number, 3 for Armstrong 
//number, 4 for palindrome number.
public class MyMath1 {
	public static boolean checker(PerformOperationall p, int num, int numb) {
	    return p.check(num, numb);
	}

	public static PerformOperationall isPalindrome() {
	    return (a, c) -> c == Integer.parseInt(new StringBuilder(String.valueOf(c)).reverse().toString())?true
	           : false;
	}

	public static PerformOperationall isEven() {
	    return (a, c) -> (c % 2 == 0) ? true : false;



	}

	public static PerformOperationall isOdd() {
	    return (a, c) -> (c % 2 != 0) ? true : false;
}
}