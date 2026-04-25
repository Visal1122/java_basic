package com.visal.learning;

public class WithoutGenericType {
	private Object value;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}


	public static void main(String[] args) {
		WithoutGenericType withoutGenericType = new WithoutGenericType();
		withoutGenericType.setValue("visal");
		withoutGenericType.setValue(12);
		String st = (String) withoutGenericType.getValue();
		System.out.println(st);
	}
	
}
