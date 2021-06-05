//给定一棵二叉搜索树，请找出其中的第k小的TreeNode结点。
import java.util.ArrayList;

public class KthNode {
	ArrayList<TreeNode> al = new ArrayList<>();
	TreeNode KNode(TreeNode pRoot, int k) {
		firstSearch(pRoot);
        if(pRoot==null||k<=0||al.size()<k) 
			return null;
		return al.get(k-1);
	}
	public ArrayList<TreeNode> firstSearch(TreeNode pRoot ){
		if(pRoot ==null)
			return null;
		firstSearch(pRoot.left);
		al.add(pRoot);
		firstSearch(pRoot.right);
		return al;
		
	}

}
