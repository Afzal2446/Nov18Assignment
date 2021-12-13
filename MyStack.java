package AssignmentNov18;

import java.util.Stack;

public class MyStack {
	public static void main(String args[]) {
		
		Stack<Integer> stack= new Stack<>();
		
		stack.push(12);
		stack.push(10);
		stack.push(14);
		
		System.out.println(stack);
		System.out.println(stack.peek());// Display top element.
		
		System.out.println(stack.pop());// rempve top element.
	}
}
