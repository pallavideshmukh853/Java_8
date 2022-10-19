package com.java8;

import java.io.*;
import java.util.Scanner;

interface Check3{
	
	void print();
	
}
public class CheckEvenOddArmsPalindrom03{

	public static void main(String[] args) {
		
		Check3 c=null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number");
		int value= scan.nextInt();
		scan.nextLine();
		switch(value) {
		
		case 1:
			c=()->{
				System.out.println("Enter second number");
				if(scan.nextInt()%2==0) {
					System.out.println("number is even");
				}
				else{
					System.out.println("number is not even");
				}
			};
			c.print();
			break;
		case 2:System.out.println("Enter second number");
		c=()->{
			int i=scan.nextInt();
			if(i%2!=0) {
				System.out.println("number is an odd");
			}
			else{
				System.out.println("number is not an odd");
			}
		};
		c.print();
			break;
		case 3:
		c=()->{
			System.out.println("Enter second number");
			int i=scan.nextInt();
			int temp=i, num=i,count=0,mul,sum=0;
			
			while(temp!=0) {
				temp=temp/10;
				count++;
			}
			while(i!=0) {
				int digit=i%10;
				mul=1;
				for(int j=1;j<=count;j++) {
					mul=mul*digit;
			}
				sum=sum+mul;
				i=i/10;
			}
			if(num==sum) {
				System.out.println("number is an armstrong");
			}
			else {
				System.out.println("number is not an armstrong");
			}
			
		};
		c.print();
			break;
		case 4:System.out.println("Enter second number");
		  c=()->{ 
			  int i=scan.nextInt(),num,digit,rem=0;
		   num=i;
		   while(i!=0) {
				digit=i%10;
				rem=rem*10+digit;
				i=i/10;
		   }
		   if(num==rem) {
			   System.out.println("Number is Palindrom");
		   }
		   else{
			   System.out.println("Number is not Palindrom");
		   }
		  };
		  c.print();
			break;
		default:System.out.println("Enter valid number");
			break;
		  
		}
	}
}


/*
 * interface PerformOperationall { boolean check(int a, int b); }
 * 
 * class MyMath1 { public static boolean checker(PerformOperationall p, int num,
 * int numb) { return p.check(num, numb); }
 * 
 * public static PerformOperationall isPalindrome() { return (a, c) -> c ==
 * Integer.parseInt(new StringBuilder(String.valueOf(c)).reverse().toString()) ?
 * true : false; } public static PerformOperationall isEven() { return (a, c) ->
 * (c % 2 == 0) ? true : false;
 * 
 * } public static PerformOperationall isOdd() { return (a, c) -> (c % 2 != 0) ?
 * true : false;
 * 
 * } }
 * 
 * public class CheckEvenOddArmsPalindrom03 {
 * 
 * public static void main(String[] args) throws NumberFormatException,
 * IOException {
 * 
 * MyMath1 ob = new MyMath1(); BufferedReader br = new BufferedReader(new
 * InputStreamReader(System.in)); System.out.println("Enter number : "); int T =
 * Integer.parseInt(br.readLine()); int input = Integer.parseInt(br.readLine());
 * 
 * PerformOperationall op; boolean ret = false; String ans = null;
 * 
 * // op = ob.isPalindrome();
 * 
 * // System.out.println(ans);
 * 
 * if (T == 1) { op = ob.isEven(); ret = ob.checker(op, T, input); ans = (ret) ?
 * "ODD" : "EVEN"; if (ret == true) { System.out.println(" num is even"); }
 * System.out.println(" num is not even"); } if (T == 2) { op = ob.isOdd(); ret
 * = ob.checker(op, T, input); ans = (ret) ? "ODD" : "EVEN"; //
 * System.out.println(ret); if (ret == true) {
 * System.out.println(" num is odd"); } System.out.println("num is not odd"); }
 * if (T == 4) { op = ob.isPalindrome(); ret = ob.checker(op, T, input);
 * 
 * ans = (ret) ? "PALINDROME" : "NOT PALINDROME"; if (ans == "PALINDROME") {
 * System.out.println("it is palindrome"); }
 * System.out.println("it is not palindrome"); }
 * 
 * br.close(); } }
 */