import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(4);
		stack.push(5);
		stack.push(1);
		System.out.println(stack);
		System.out.println(stack.pop());
		stack.push(7);
		System.out.println(stack);
	}
}
