/*
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 *  例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class DeleteDuplicateNode {
	public ListNode deleteDuplication(ListNode pHead) {
		if(pHead==null)
			return pHead;
		ListNode newHead = new ListNode(0);
		newHead.next = pHead;
		ListNode pNode = pHead;
		ListNode pre = newHead;
		while(pNode!=null) {
			if(pNode.next!=null&&pNode.val ==pNode.next.val) {
				while(pNode.next!=null&&pNode.val==pNode.next.val) {
					pNode =pNode.next;
				}
				pNode = pNode.next;
				pre.next = pNode;
			}
			else {
				pNode = pNode.next;
				pre = pre.next;				
			}
		}
	return newHead.next;			
	}

}
