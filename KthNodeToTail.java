//输入一个链表，输出该链表中倒数第k个结点
/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */
public class KthNodeToTail {
	public ListNode FindKthToTail (ListNode pHead, int k) {
		if(pHead ==null ||k<=0)
			return null;
		ListNode fast = pHead;
		ListNode slow = pHead;
		while(k>0&&fast!=null) {
			fast = fast.next;
            k--;
		}
        if(k>0) return null;
		while(fast!=null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
	}
}
