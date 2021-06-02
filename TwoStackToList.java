//用两个栈实现队列
import java.util.*;
public class TwoStackToList {
	Stack<Integer> sin = new Stack<>();
	Stack<Integer> sout = new Stack<>();
	
	public void push(int num) {
		sin.push(num);
	}
	
	public int pop() {
		if(sout.isEmpty()){
			while(!sin.isEmpty())
				sout.push(sin.pop());
			}
		return sout.pop();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStackToList aList = new TwoStackToList();
		aList.push(1);
		aList.push(2);
		aList.push(3);
		System.out.println(aList.pop());
		System.out.println(aList.pop());
		
	}

}
