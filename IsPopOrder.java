//输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。
import java.util.*;
public class IsPopOrder {
	public boolean IsPopOrderArr(int [] pushA,int [] popA) {
		if(pushA.length!=popA.length)
			return false;
		int poplen = popA.length;
		Stack<Integer> pushStack = new Stack<>();
		int j =0;
		for(int i=0;i<pushA.length;i++) {
			pushStack.push(pushA[i]);
			while(j<poplen &&(!pushStack.empty()&&pushStack.peek()==popA[j])) {
				pushStack.pop();
				j++;
				}
			}
		return pushStack.empty();
	}
}
