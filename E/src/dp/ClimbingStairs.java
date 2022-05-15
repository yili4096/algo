package dp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClimbingStairs {

	@Test
	void test() {
//		fail("Not yet implemented");
	}
	
	@Test
	void testClimbing() {
		System.out.println("d");
		
		int[] dp = new int[20];
		
		dp[0] = 0;
		dp[1]=1;
		dp[2]=2;
		
		for (int i = 3; i < 20; i ++) {
			dp[i]=dp[i-1] + dp[i-2];
		} 

		for (int i =0; i < 15; i ++) {
			System.out.println("i:" + i + "; result:"+ dp[i]);
		}
		
	}
	
	@Test
	void testChest() {
		int m = 7;
		int n = 3;
//		if (m <= 0 || n <= 0) {
//	        return 0;
//	    }

	    int[][] dp = new int[m][n]; // 
	    // 初始化
	    for(int i = 0; i < m; i++){
	      dp[i][0] = 1;
	    }
	    for(int i = 0; i < n; i++){
	      dp[0][i] = 1;
	    }
	        // 推导出 dp[m-1][n-1]
	    for (int i = 1; i < m; i++) {
	        for (int j = 1; j < n; j++) {
	            dp[i][j] = dp[i-1][j] + dp[i][j-1];
	        }
	    }
		System.out.println(dp[m-1][n-1]);		
	}

}
