package linklist;

public class Tools {

	public static ListNode converse(int[] da) {
		ListNode head = new ListNode(0);
		ListNode p = head;
		for (int i : da) {
			head = new ListNode(head, i);
		}
		return p.next;
	}
	
	public static void prt(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	
	public static void main(String[] args) {
		ListNode no = converse(new int [] {1,2,3,4,5,6});
		System.out.print(no);
	}
}
