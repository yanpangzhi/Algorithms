//从上往下打印出二叉树的每个节点，同层节点从左至右打印
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
import java.util.*;

import javax.swing.tree.TreeNode;
public class PrintTreeByRow {
	 public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
		 ArrayList<Integer> arrayList = new ArrayList<>();
		 if(root ==null)
			 return arrayList;
		 LinkedList<TreeNode> tmp = new LinkedList<>();
		 TreeNode pNode = null;
		 tmp.add(root);
		 while(!tmp.isEmpty()) {
			 pNode = tmp.poll();
			 arrayList.add(pNode.val);
			 if(pNode.left!=null)
				 tmp.add(pNode.left);
			 if(pNode.right!=null)
				 tmp.add(pNode.right);
		 }
		 return arrayList;
				 		 
	 }

}
