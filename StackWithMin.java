//包含min函数的栈
import java.util.Stack;
public class StackWithMin {
	Stack<Integer> st1 = new Stack<>();
	Stack<Integer> stMin = new Stack<>();
	public void push(int num) {
		st1.push(num);
		if(stMin.empty()||stMin.peek()>=num)
			stMin.push(num);
	}
	
	public int pop() {
		if(st1.peek() ==stMin.peek())
			stMin.pop();
		return st1.pop();
	}
	
	public int top() {
		return st1.peek();
	}
	
	public int min() {
		return stMin.peek();
	}
	

}
