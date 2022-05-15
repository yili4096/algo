import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class S1 {

	public static void main(String[] args) throws Exception {
		String s = read("C:\\Users\\yili_\\Desktop\\a.txt");
		String t = read("C:\\Users\\yili_\\Desktop\\b.txt");
		isAnagram(s, t);
	}
	
	public static String read(String file) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String everything = null;
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		     everything = sb.toString();
		} catch(Exception e) {
			
		}finally {
		    br.close();
		}
		return everything;
	}
	
	 public static boolean isAnagram(String s, String t) {
	        if (s.length() != t.length()) {
	            return false;
	        }
	        
	        Map<Character, Integer> sCountMap = new HashMap<Character, Integer>();
	        Map<Character, Integer> tCountMap = new HashMap<Character, Integer>();
	        char[] sArray = s.toCharArray();
	        char[] tArray = t.toCharArray();
	        
	        for (int i = 0; i < sArray.length; i ++) {
	            add(sCountMap, sArray[i]);
	            add(tCountMap, tArray[i]);
	        }
	        
	        System.out.println(sCountMap.toString());
	        System.out.println(tCountMap.toString());
	        for (Character c : sCountMap.keySet()) {
	            if (!tCountMap.get(c).equals(sCountMap.get(c))) {
	                return false;
	            }
	        }
	        return true;
	    }
	    
	    
	    private static void add(Map<Character, Integer> sCountMap, char s) {
	        if (sCountMap.containsKey(s)) {
	            sCountMap.put(s, sCountMap.get(s) +1);
	        } else {
	            sCountMap.put(s, 1);
	        }
	    }

}
