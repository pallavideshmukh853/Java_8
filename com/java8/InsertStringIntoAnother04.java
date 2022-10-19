package com.java8;

import java.util.Arrays;
import java.util.List;

public class InsertStringIntoAnother04 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("hello ", " world");

		StringBuilder sb = new StringBuilder();
		list.forEach(sb::append);
		// System.out.println(sb);
		System.out.println(sb.insert(5, " my"));
		// String con = sb.toString();

		System.out.println(sb);
	}

}
