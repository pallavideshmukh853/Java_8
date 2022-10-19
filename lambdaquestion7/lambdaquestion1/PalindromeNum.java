package lambdaquestion1;

import java.util.stream.IntStream;

//WAP to check the given no is palindrome or not. Don’t use divide 
//method. 
public class PalindromeNum {
	public static void main(String[] args) {
        int num =341;
         int num1 = IntStream.iterate(num, i -> i / 10).map(n -> n % 10).limit(String.valueOf(num).length())
                  .reduce(0, (a, b) -> a = a * 10 + b);
          if (num == num1) {
              System.out.println("The palindrome number is " + num1);
          } else {
              System.out.println(num + " is not a palindrome number ");
          }
}}
