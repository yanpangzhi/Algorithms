import java.util.Random;

/*
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针random指向一个随机节点）
 * 请对此链表进行深拷贝，并返回拷贝后的头结点。
 */
/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class CloneNode {
	public RandomListNode Clone(RandomListNode pHead) {
		if(pHead ==null)
			return null;
		CloneNode(pHead);
		CloneRandomNode(pHead);
		return SplitNode(pHead);
		
	}
	
	public void CloneNode(RandomListNode pHead) {
		RandomListNode pNode = pHead;
		while(pNode!= null) {
			RandomListNode pNext = new RandomListNode(pNode.label);
			pNext.next = pNode.next;
			pNode.next = pNext;
			pNode = pNext.next;			
		}
	}
	
	public void CloneRandomNode(RandomListNode pHead) {
		RandomListNode pNode = pHead;
		RandomListNode pNext;
		while(pNode!=null) {
			pNext = pNode.next;
			if(pNode.random!=null) {
				pNext.random = pNode.random.next;
			}
			pNode = pNext.next;
		}
	}
	
	public RandomListNode SplitNode(RandomListNode pHead) {
		RandomListNode pNode = pHead;
		RandomListNode pCloneHead = null;
		RandomListNode pCloneNode = null;
		if(pNode!=null) {
			pCloneHead = pCloneNode = pNode.next;
			pNode.next = pCloneHead.next;
			pNode = pNode.next;		
		}
		
		while(pNode!= null){
			pCloneNode.next = pNode.next;
			pCloneNode = pCloneNode.next;
			pNode.next = pCloneNode.next;
			pNode = pNode.next;
			
		}
		return pCloneHead;
		
	}
}
