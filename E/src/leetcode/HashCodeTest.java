package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class HashCodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "OkOkOkOkOkOkOkOkOkOkOkOkOkOkOkOkOkOkOk";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(s.hashCode() + " " + sb.hashCode());
		
		String t = new String("OkOkOkOkOkOkOkOkOkOkOkOkOkOkOkOkOkOkOk");
		StringBuilder tb = new StringBuilder(s);
		System.out.println(t.hashCode() + " " + tb.hashCode());
		
		
		
		Double d1 = new Double(9); 
		System.out.println(d1.hashCode() + " ");
		Double d2 = new Double(9); 
		System.out.println(d2.hashCode());
		
		
		Object[] luckyNumbers = { 2, 3, 5, 7, 11, 13 };
		String yyy = "" + luckyNumbers;
		System.out.println(yyy);
		System.out.println(Arrays.deepToString(luckyNumbers));
		
		
		String alice1 = new String("Alice Adams");
//		var staff = new ArrayList<String>();
//		var alice2 = alice1;
//		var alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
	}

}
