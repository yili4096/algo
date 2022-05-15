package leetcode;
public class KVPd implements Comparable<KVPd>{
		char c;
		int i;
		KVPd(int i, char c){
			this.i = i;
			this.c = c;
		}
		
		
		@Override
		public String toString() {
			StringBuffer buf = new StringBuffer();
			
//			Stream
			for (int j = 0; j < i; j ++) {
				buf.append(c);
			}
			return buf.toString();
		}


		@Override
		public int compareTo(KVPd o) {
			return o.i - this.i;
		}
		
	}