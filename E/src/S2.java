
public class S2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
	
	
	 public static boolean isPalindrome(String s) {
	        int end = s.length() - 1;
	        int start = 0;
	        char[] cArray = s.toCharArray();
	        while (start < end) {
	           if (!isAlphanumeric(cArray[start])) {
	               start ++;
	               continue;
	           }
	            if (!isAlphanumeric(cArray[end])) {
	                end --;
	                continue;
	            }
	            if (convertToLower(cArray[start]) != convertToLower(cArray[end])  ) {
	                return false;
	            }
	            start ++;
	            end --;
	        }
	        return true;
	    }
	    
	    private static boolean isAlphanumeric(char c) {
	        // 48 -57
	        // 65 - 90
	        // 97 - 122
	        if ((c >= 48 && c <= 57) 
	           || (c >= 65 && c <= 90)
	           || (c >= 97 && c <= 122)) {
	            return true;
	        }
	        return false;
	    }
	    
	    private static char convertToLower(char c) {
	        if (c >= 97 && c <= 122) {
	            c = (char)(c - 32);
	        }
	        return c;
	    }

}
