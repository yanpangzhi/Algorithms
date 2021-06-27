/*
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，
 * 第三行按照从左到右的顺序打印，其他行以此类推。
 */
/*
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
public class PrintTreeByS {
	 public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		 ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		 if(pRoot==null)
			 return result;
		 ArrayList<Integer> tmp = new ArrayList<>();
		 LinkedList<TreeNode> row = new LinkedList<>();
		 TreeNode pNode = null;
		 TreeNode last = pRoot;
		 TreeNode nextLast = null;
		 row.add(pRoot);
		 boolean flag = true;
		 while(row.size()!=0) {
			 pNode = row.poll();
			 tmp.add(pNode.val);
			 if(pNode.left!=null) {
				 row.add(pNode.left);
				 nextLast = pNode.left;
			 }
			 if(pNode.right!=null) {
				 row.add(pNode.right);
				 nextLast = pNode.right;
			 }
			 if(pNode ==last) {
				 last =nextLast;
				 if(!flag) {
					 Collections.reverse(tmp);
				 }
				 result.add(tmp);
				 tmp=new ArrayList<>();
				 flag = !flag;
			 }
		}
		 return result;		 
	 } 
		 
}
