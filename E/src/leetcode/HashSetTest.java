package leetcode;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class HashSetTest {

    static final int MAXIMUM_CAPACITY = 1 << 30;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>(20);
		int size = tableSizeFor(20);
		System.out.println("init size:" + set.size());
		for (int i = 0; i < 16; i ++) {
			set.add(String.valueOf(i));
			System.out.println("add index:" + (i+1) + "; size:" + set.size());
		}
		for (int i = 0; i < 50; i ++) {
			set.add(String.valueOf(i));
			System.out.println("add index:" + (i+1) + "; size:" + set.size());
		}
		
		Map m  = new HashMap();
		m.put("d00", "ab");
		System.out.print(m.values().stream().filter(a-> "ab".equals(a)).collect(Collectors.counting()));
		System.out.println( m.values().stream().filter(a->"ab".equals(a)).collect(Collectors.counting()));
	}

	 static final int tableSizeFor(int cap) {
	        int n = cap - 1;
	        n |= n >>> 1;
	        n |= n >>> 2;
	        n |= n >>> 4;
	        n |= n >>> 8;
	        n |= n >>> 16;
	        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
	    }
}
