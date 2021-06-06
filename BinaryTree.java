import javax.swing.tree.TreeNode;

/*
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.Arrays;
public class BinaryTree {
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		if(pre==null ||in==null||pre.length!=in.length)
			return null;
		int prelen = pre.length;
		int inlen = in.length;
		if(prelen==0||inlen==0)
			return null;
		TreeNode root = new TreeNode(pre[0]);
		for(int i =0;i<in.length;i++) {
			if(pre[0]==in[i]) {
				root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1),Arrays.copyOfRange(in, 0, i));
				root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, prelen),Arrays.copyOfRange(in, i+1, inlen));
				break;
			}
		return root;
		}
	}

}
