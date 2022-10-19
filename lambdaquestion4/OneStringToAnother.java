package lambdaquestion4;

import java.util.Arrays;
import java.util.List;

//WAP to insert one string into another string. Also perform garbage 
//collection when insertion is done.
public class OneStringToAnother {
	public static void main(String[] args) {
	       List<String> list = Arrays.asList("nishi"," here");
	       StringBuilder sb = new StringBuilder();
	        list.forEach(sb::append);
	        // System.out.println(sb);
	        System.out.println(sb.insert(5," tawde"));
	        System.out.println(sb);
	    }
}
