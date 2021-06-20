
//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class SubTree {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		if(root1==null ||root2 ==null)
			return false;
		return HasTree2(root1, root2)||HasSubtree(root1.left, root2)||HasSubtree(root1.right, root2);
	}
	
	public boolean HasTree2(TreeNode root1,TreeNode root2) {
		//子树遍历完成，说明有此结构
		if(root2 ==null)
			return true;
		if(root1 ==null)
			return false;
		if(root1.val != root2.val)
			return false;
		return HasTree2(root1.left, root2.left)&&HasTree2(root1.right, root2.right);
	}

}
