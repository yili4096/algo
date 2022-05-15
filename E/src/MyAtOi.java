
public class MyAtOi {

	public static void main(String[] args) {
//		System.out.println(myAtoi("42"));
		System.out.println(myAtoi("words and 987"));
		

	}
	
	
	
	
	public static int myAtoi(String str) {
		char[] strArray = str.toCharArray();
        boolean isNegative = false;
        boolean isValid = false;
        long value = 0l;
        for (char c : strArray) {
            if (!isValid) {
                if(c == '-') {
                    isNegative = true;
                    isValid = true;
                } else if (c == ' ' || (c >= 'A' && c <= 'Z') || (c>='a' && c <='z')) {
                    continue;
                } else if (c >= '0' && c <= '9') {
                    isValid = true;
                    value = value * 10 + Integer.valueOf(String.valueOf(c));
                } 
            } else if (c >= '0' && c <= '9') {
                 value = value * 10 + Integer.valueOf(String.valueOf(c));
            } else {
                break;
            }
        }
        
        if (isNegative) {
            value *= -1;
        }
        if (value > 0x7fffffff || value < 0x80000000) {
            value = 0l;
        }
        return (int) value;
    }
    

}
