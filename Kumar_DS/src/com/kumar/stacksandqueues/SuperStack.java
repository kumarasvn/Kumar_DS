/*Design a data structure called SuperStack which include push pop 
 * and findMax with constant space in worst case
 * */
package com.kumar.stacksandqueues;

import java.util.Stack;

public class SuperStack {
	Stack<Integer> elementStack;
	Stack<Integer> maxStack;

	public SuperStack() {
		elementStack = new Stack<Integer>();
		maxStack = new Stack<Integer>();
	}

	public void push(Integer n) {
		elementStack.push(n);
		if ((maxStack.isEmpty())
				|| (!maxStack.isEmpty() && maxStack.peek() <= n))
			maxStack.push(n);
	}

	public int pop() {
		if (elementStack.isEmpty()) {
			return Integer.MIN_VALUE;
		} else {
			int top = elementStack.pop();
			if (top == maxStack.peek())
				maxStack.pop();
			return top;
		}
	}

	public int findMax() {
		if (!maxStack.isEmpty())
			return maxStack.peek();
		return Integer.MIN_VALUE;
	}

}
