//两个链表的第一个公共结点
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class FirstCommonNode {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if(pHead1==null||pHead2 ==null)
			return null;
		int len1 = getLen(pHead1);
		int len2 = getLen(pHead2);
		int dif = Math.abs(len1-len2);
		ListNode common = pHead1;
		ListNode pNode = pHead2;
		if(len1<len2) {
			common = pHead2;
			pNode = pHead1;
			}
		while(dif>0) {
			common = common.next;
			dif--;
		}
		while(common!=null&&pNode!=null) {
			if(common ==pNode) {
				return common;
			}
			else {
				common = common.next;
				pNode = pNode.next;
			}
		return null;	
		
		}
	}
	
	public int getLen (ListNode node) {
		ListNode tmp = node;
		if(node ==null)
			return 0;
		int len =0;
		while(tmp!=null) {
			len ++;
			tmp =tmp.next;			
		}
		return len;
	}
}
