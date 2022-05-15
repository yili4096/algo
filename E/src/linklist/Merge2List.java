package linklist;

public class Merge2List {

	public static void main(String[] args) {
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4, node5);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);
		

		ListNode node2a = new ListNode(2);
		ListNode node1a = new ListNode(1, node2a);
		
		mergeTwoLists(node1, node1a);
	}
	
	
	
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode dummyHead = new ListNode(0);
	        getNode(l1, l2, dummyHead);
	        return dummyHead.next;
	    }
	    
	 static void  getNode(ListNode l1, ListNode l2, ListNode dummyHead) {
	        if (l1 != null && l2 != null) {
//	            ListNode head = l1.val < l2.val ? l1 : l2;
	             ListNode newHead = l1.val < l2.val ? getFirst(l1) : getFirst(l2);
	            newHead.next = dummyHead.next;
	            dummyHead.next = newHead;
	            getNode(l1, l2, dummyHead);
	        } else if (l1 == null && l2 == null) {
	            return ; 
	        } else {
	            ListNode newHead = getFirst(l1 == null ? l2 : l1);
	            newHead.next = dummyHead.next;
	            dummyHead.next = newHead;
	            getNode(l1, l2, dummyHead);
	        }
	    }
	    
	    
	 static  ListNode  getFirst(ListNode ln) {
	        ListNode node = ln;
	        ln = ln.next;
	        node.next = null;
	        return node;
	    }

}
