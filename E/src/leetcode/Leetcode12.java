package leetcode;

import java.util.Arrays;

public class Leetcode12 {
	
	public static void main(String[] args) {
		
		int num = 2;
		 final int[] nums = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	        final String[] romans = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	        
	        int index = 0;
	        StringBuffer buf = new StringBuffer();
	        while (num > 0) {
	            if (num - nums[index] >= 0) {
	                num -= nums[index];
	                buf.append(romans[index]);
	            } else {
	                index ++;
	            }
	        }
	        
//	        return buf.toString();
	        System.out.println(buf.toString());
//	        StringBuilder sb = new StringBuilder();
//	        int i = 0;
//	        while (num > 0) {
//	            if (num - nums[i] >= 0) {
//	                sb.append(strings[i]);
//	                num -= nums[i];
//	            } else {
//	                i++;
//	            }
//	        }
	        
	        Arrays.sort(romans);
	        for (String  string : romans) {
				System.out.println(string);
			}
	}
	

}
