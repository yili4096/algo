package leetcode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class leetcode451 {
	
	@Test
	public void testFrequencySort() {
		assertEquals(frequencySort("tree"), "eert");
//		Assert.assertContains("eert eetr", frequencySort("tree"));
	}
	


	public String frequencySort(String s) {
		int[] cArray = new int[256];
		for (Character c : s.toCharArray()) {
			cArray[c] ++;
		}
		
		List<KVP> kvpList = new ArrayList<>();
		IntStream.range(0, 256).forEach(i-> {
			if (cArray[i] != 0) {
				kvpList.add(new KVP(cArray[i], (char)i));
			}
		});
		
		Collections.sort(kvpList);
		
		StringBuffer buf = new StringBuffer();
		for (KVP kvp: kvpList) {
			buf.append(kvp.toString());
		}
//		
		return buf.toString();
//		kvpList.stream().collect(Collectors.joining());
		

	}

	public static void main(String[] args) {
		

	}
	
	private class KVP implements Comparable<KVP>{
		char c;
		int i;
		KVP(int i, char c){
			this.i = i;
			this.c = c;
		}
		
		
		@Override
		public String toString() {
			StringBuffer buf = new StringBuffer();
//			
//			for (int j = 0; j < i; j ++) {
//				buf.append(c);
//			}
//			return buf.toString();
			
			 IntStream.range(0, i).forEach( x-> buf.append(c));
			 return buf.toString();
		}


		@Override
		public int compareTo(KVP o) {
			return o.i - this.i;
		}
		
	}
	@Test
	public void testA() {
//		System.out.print('d');
//		new String(new char[n]).replace("\0", s);
		String s = new String(new char[5]).replace('\0', 'd');
		String.join("", Collections.nCopies(5, "f"));
		System.out.print(s				);
	}

}
