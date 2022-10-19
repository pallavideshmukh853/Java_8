package lamdaquestion2;

import java.util.Arrays;

//WAP to check the given sequence of character in given string. Suppose 
//that you are given following string “Taj is situated in Agra.” And you 
//have to find following sequence AST. AST should be one after another. If 
//you found sta, or tas, or tsa it should print string not found.
public class StringSequence {
public static void main(String[] args) {
	
        String givenstr[] = {"Taj is situated in Agra"};
        String findstr="ast";
        boolean anyMatch = Arrays.stream(givenstr).anyMatch(s->s.contains(findstr));
        //System.out.println(anyMatch);
        if(anyMatch==true) {
            System.out.println(findstr+" String found");
        }
        System.out.println(findstr+" String not found");
}
}
