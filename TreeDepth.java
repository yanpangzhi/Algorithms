//二叉树的深度
public class TreeDepth {
	public int TreeHeight(TreeNode root) {
		if (root==null)
			return 0;
		int left = TreeHeight(root.left);
		int right = TreeHeight(root.right);
		return Math.max(left,right)+1;
	}
}
