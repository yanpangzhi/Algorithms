//合并两个排序的链表
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Merge {
	public ListNode MergeNode(ListNode list1,ListNode list2) {
		if( list1==null)
			return list2;
		if(list2==null)
			return list1;
		if(list1.val <= list2.val) {
			list1.next = MergeNode(list1.next,list2);
			return list1;
		}
		else {
			list2.next = MergeNode(list1,list2.next);
			return list2;
		}			
	}

}
