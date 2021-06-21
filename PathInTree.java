/*
 * 输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.tree.TreeNode;
public class PathInTree {
	ArrayList< ArrayList<Integer>> result = new ArrayList<>();
	Stack<Integer> list = new Stack<>();
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
		if(root==null)
			return result;
		list.push(root.val);
		target -=root.val;
		if(root.left==null&&root.right==null&&target ==0)
			result.add(new ArrayList<Integer>(list));
			
		FindPath(root.left, target);
		FindPath(root.right, target);
		list.pop();
		return result;
	}

}
