/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
平衡二叉树（Balanced Binary Tree），具有以下性质：它是一棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树。
 * @author 12191
 *
 */
public class IsBalancedTree {
	public boolean IsBalanced_Solution(TreeNode root) {
		return getDepth(root)!=-1;
		
	}
	public int getDepth(TreeNode root) {
		if (root ==null)
			return 0;
		int left = getDepth(root.left);
		if(left == -1) 
			return -1;
		int right = getDepth(root.right);
		if(right==-1)
			return -1;
		int dif = Math.abs(left-right);
		if(dif>1)
			return -1;
		return Math.max(left, right)+1;		
	}

}
