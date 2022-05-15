package linklist;

public class Reverse {

	public static void main(String[] args) {
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4, node5);
		ListNode node3 = new ListNode(3, node4);
		ListNode node2 = new ListNode(2, node3);
		ListNode node1 = new ListNode(1, node2);
		ListNode dummyNode = new ListNode(0);

		reverse(node1, dummyNode);
		System.out.println(dummyNode.next);
	}

	private static void reverse(ListNode head, ListNode dummyHead) {
		if (head == null) {
			return;
		} else {
			ListNode current = head;
			head = head.next;

			current.next = dummyHead.next;
			dummyHead.next = current;
			reverse(head, dummyHead);
		}
	}
}
