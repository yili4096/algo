package leetcode;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import org.junit.Test;

public class leetcode347TopKFrequentElements {
	
	public leetcode347TopKFrequentElements() {}
	
    public static List<Integer> calc(int[] nums, int k) {
    	
    	Map<Integer, Integer> countMap = new HashMap<>();
    	for(int i : nums) {
    		countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }
        
    	PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparing(e->e.getValue()));
        for (Map.Entry<Integer, Integer> item : countMap.entrySet()) {
        	pq.offer(item);
        	if (pq.size() > k) {
        		pq.poll();
        	}
        }
        
        
//        int length = pq.size();
//        int[] resultList2 = new int[length];
//         while(pq.size() > 0) {
//         	// resultList.add(pq.poll().getKey());
//        	 resultList2[--length] = pq.poll().getValue();
//         }
         
        
        List<Integer> resultList = new ArrayList<>();
        while(pq.size() > 0) {
        	resultList.add(pq.poll().getKey());
        }
        
        Collections.reverse(resultList);
//        Collections.sort(resultList, Collections.reverseOrder());
        
        resultList.stream().forEach(System.out::println);
        return resultList;
        
    }
    

    
    public static void main(String[] args) {

    	calc(new int[] {1,1,1,2,2,3}, 2);
    	
    }
    
}