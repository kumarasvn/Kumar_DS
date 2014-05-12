package com.kumar.stacksandqueues;

public class SuperStackTesting {
	public static void main(String[] args) {
		SuperStack s = new SuperStack();
		s.push(10);
		s.push(20);
		s.push(3);
		s.push(100);

		System.out.println("maximum is " + s.findMax());

	}

}
