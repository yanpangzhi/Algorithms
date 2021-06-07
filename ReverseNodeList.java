//输入一个链表，反转链表后，输出新链表的表头。
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class ReverseNodeList {
	public ListNode ReverseList(ListNode head) {		
		if(head ==null||head.next==null)
			return head;
		ListNode root = ReverseList(head.next);
		head.next.next = head;
		head.next = null;
		return root;
	}

}
