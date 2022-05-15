package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

import org.junit.Test;

public class leetcode703KthLargest {
	int k;
	PriorityQueue<Integer> pq ;
	
	public leetcode703KthLargest() {}

    public leetcode703KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
//         pq = new PriorityQueue();
         pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i : nums) {
        	add(i);
        }
    }
    
    public int add(int val) {
    	pq.add(val);
    	
    	if (pq.size() > k)
    		pq.poll();
    	return pq.peek();
    }
    
    
    public static void main(String[] args) {

    	leetcode703KthLargest l = new leetcode703KthLargest(3, new int[] {4, 5, 8, 2});
    	
    	System.out.println(l.add(3));
    	System.out.println(l.add(5));
    	System.out.println(l.add(10));
    	System.out.println(l.add(9));
    	System.out.println(l.add(2));
    	System.out.println(l.add(4));
    }
    
    @Test
    public void test1() {
    	leetcode703KthLargest l = new leetcode703KthLargest(3, new int[] {4, 5, 8, 2});
    	
    	System.out.println(l.add(3));
    	System.out.println(l.add(5));
    	System.out.println(l.add(10));
    	System.out.println(l.add(9));
    	System.out.println(l.add(4));
    }
}