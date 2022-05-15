package leetcode;

public class InterSectionOfArrays {

	public static void main(String[] args) {
		int [] nums1 = new int[] {1,2,3};
		int [] nums2 = new int[] {2,4,3,8,2};
		int[] recorder = new int[1000];
		for (int i : nums1) {
			if (recorder[i] == 0) {
				recorder[i] = 1;
			}
		}
		int count = 0;
		for (int j : nums2) {
			if (recorder[j] == 1) {
				recorder[j] = 2;
				count ++;
			}
		}
		
		int[] result = new int[count];
		int index = 0;
		for (int i =0; i < 1000; i++) {
			if (recorder[i] == 2 ) {
				result[index ++] = i;
			}
		}
		
		for (int i : result) {
			System.out.print(i);
		}

	}

}
