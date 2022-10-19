package lambdaquestion3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckEvenOddArmsPalindrom {
public static void main(String[] args)  throws NumberFormatException, IOException{
	MyMath1 ob = new MyMath1();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter number to check for Palindrome");
    int T = Integer.parseInt(br.readLine());
    int input = Integer.parseInt(br.readLine());

   PerformOperationall op;
    boolean ret = false;
    String ans = null;

   // op = ob.isPalindrome();
   // System.out.println(ans);

   if (T == 1) {
        op = ob.isEven();
        ret = ob.checker(op, T, input);
        ans = (ret) ? "ODD" : "EVEN";
        if (ret == true) {
            System.out.println(" num is even");
        }
        System.out.println(" num is not even");
    }
    if (T == 2) {
        op = ob.isOdd();
        ret = ob.checker(op, T, input);
        ans = (ret) ? "ODD" : "EVEN";
        // System.out.println(ret);
        if (ret == true) {
            System.out.println(" num is odd");
        }
        System.out.println("num is not odd");
    }
    if (T == 4) {
        op = ob.isPalindrome();
        ret = ob.checker(op, T, input);

       ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
        if (ans == "PALINDROME") {
            System.out.println("it is palindrome");
        }
        System.out.println("it is not palindrome");
    }
    
    br.close();
}
}
