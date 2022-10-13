package com.revature;

/*
 * VarArgs is short for "Variable Arguments".  It allows us to create a method that takes an indefinite 
 * number of arguments when called.
 */

public class VarArgs {

	public static void main(String[] args) {
		
		VarArgs varargs = new VarArgs();
		varargs.add(3, 2);
		int answer = varargs.add(3, 5, 8, 9, 22);
		System.out.println(answer);
		
	}
	/*
	 * Java always chooses the most specific method, so even with the var args,
	 * this method will be called if there are 2 args passed in.
	 */
	public int add(int a, int b) {
		
		return a + b;
		
	}
	
	/*
	 * This is a variable argument.  It indicates that when this method is called, the caller can 
	 * pass any number of arguments.  Noe that it is treated like an array, so you have the 
	 * option to iterate over it.
	 * 
	 * You are only allowed to have one variable argument.  If you have a variable arument, 
	 * it has to be the last argument.
	 */
	public int add(int...a) {
		int sum = 0;
		for(int i : a) {
			sum += i;
		}
		return sum;
	}
	
}
