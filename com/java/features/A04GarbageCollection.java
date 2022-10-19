package com.java.features;

public class A04GarbageCollection {

	String str;

	public A04GarbageCollection(String str) {
		this.str = str;
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(this.str + " collected");
	}

	public static void main(String[] args) {
	
		String str = "Megha In Technologies!";
		String newSub = "Yash ";
		int index = 8;
		System.out.println("Initial String = " + str);
		System.out.println("Index where new string will be inserted = " + index);
		StringBuffer resString = new StringBuffer(str);
		resString.insert(index + 1, newSub);
		System.out.println("Resultant String = " + resString.toString());
		
		A04GarbageCollection gc = new A04GarbageCollection("yash");
		System.out.println("String=" + gc.str.toString());
		gc = null;
		System.gc();
	}

}
