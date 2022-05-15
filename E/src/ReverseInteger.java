
public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
		System.out.println(reverse(123));
//		System.out.println(2<<31);
//		System.out.println(2>>31 -1);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(2<<30);
//		System.out.println(2>>8);
		

	}

	
	   public static int reverse(int x) {
	        boolean isNegative = x < 0;
	        long lx = x;
	        if (isNegative) {
	            lx = 0 - lx;
	        }
	        
	        long newValue = 0l;
	        while(lx > 0) {
	            long mod = lx % 10;
	            newValue = newValue * 10 + mod;
	            lx /= 10;
	        }
	        
	        if (isNegative) {
	            newValue = newValue * -1;
	        }
	        if (newValue < 0x80000000 || newValue > 0x7fffffff) {
	            newValue = 0;
	        }
	        return (int)newValue;
	    }
	   
//	   private boolean isOverflows(long newValue) {
//		   return newValue < 0x80000000 || newValue > 0x7fffffff;
//	   }
}
