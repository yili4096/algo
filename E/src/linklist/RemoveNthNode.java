package linklist;

public class RemoveNthNode {

	public static void main(String[] args) {
//		ListNode node5 = new ListNode(5);
//		ListNode node4 = new ListNode(4, node5);
//		ListNode node3 = new ListNode(3, node4);
//		ListNode node2 = new ListNode(2, node3);
//		ListNode node1 = new ListNode(1, node2);
//		
//		removeNthFromEnd(node1, 2);

		ListNode node1a = new ListNode(1, null);
		removeNthFromEnd(node1a, 1);
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		int length = count(head);
		ListNode dummyHead = new ListNode(0);
		dummyHead.next = head;

		ListNode prefixRemoveNode = fetchNthFromHead(dummyHead, length - n);
		if (prefixRemoveNode != null && prefixRemoveNode.next != null) {
			if (prefixRemoveNode.next.next != null) {
				prefixRemoveNode.next = prefixRemoveNode.next.next;
			} else {
				prefixRemoveNode.next = null;
			}
		}
		return dummyHead.next;

	}

	private static ListNode fetchNthFromHead(ListNode head, int n) {
		if (n == 0) {
			return head;
		} else if (head.next != null) {
			return fetchNthFromHead(head.next, --n);
		} else {
			return null;
		}
	}

	private static int count(ListNode head) {
		if (head.next == null) {
			return 1;
		} else {
			return count(head.next) + 1;
		}
	}
}
