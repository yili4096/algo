package linklist;

public class Reverse61 {

	public static void main(String[] args) {
		ListNode head = Tools.converse(new int[] {1,2});

		ListNode converse = rotateRight(head, 1);
		Tools.prt(converse);
	}
	
	
	public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k < 1) return head;
        
        ListNode dummy = head;
        
        int length = 1;
        while(head.next != null) {
            head = head.next;
            length ++;
        }
        
        head.next = dummy;
            
        for (int i = 0; i < length-k%length; i ++) {
            dummy = dummy.next;
            head = head.next;
        }
        head.next = null;
        return dummy;
    }

}
