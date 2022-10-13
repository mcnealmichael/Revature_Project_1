package com.revature;

public class AccessModifiersAndScope {
	
	//Instance scoped variables
	private int field1;
	boolean field2;
	protected char field3;
	public float field4;
	
	public AccessModifiersAndScope() {
		
		this.field1 = 1;
		
	}
	
	public static void main(String[] args) {
		
		
		
	}
	
	{
		int anotherNum = 890;
	}
	
	public void method1() {
		//Local scope
		int num = 0;
		
	}
	
	public void method2() {
		
		this.field3 = 1;
		
	}
	
}
