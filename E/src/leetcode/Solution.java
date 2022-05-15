package leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	
	public static void main(String[] args) {
		int [] scores = new int[] {1,3,5,10,15};
		int[]  ages = new int[] {1,2,3,4,5};
		bestTeamScore(scores, ages);
	}
	
    public static int bestTeamScore(int[] ages, int[] scores) {
//        List<Pair> list = new ArrayList<>();
//    	for (int i = 0; i < ages.length; i ++) {
//    		list.add(new Pair(ages[i], scores[i]));
//    	}
//        
//        list.sort((a, b)->a.getAge() - b.getAge());
        
        final int n = scores.length;
        Pair[] players = new Pair[n];
        
        // dp[i] := max score of choosing players[0..i] w/ players[i] being selected
        int[] dp = new int[n];

        for (int i = 0; i < n; ++i)
          players[i] = new Pair(ages[i], scores[i]);

        Arrays.sort(players, (a, b) -> a.getAge() == b.getAge()  ? b.getScore() - a.getScore() : b.getAge()  - a.getAge() );

        for (int i = 0; i < n; ++i) {
          // for each player, we choose it first
          dp[i] = players[i].getScore();
          // players[j].age >= players[i].age since we sort in descending order
          // so we only have to check that
          // players[j].score >= players[i].score
          for (int j = 0; j < i; ++j)
            if (players[j].getScore() >= players[i].getScore())
              dp[i] = Math.max(dp[i], dp[j] + players[i].getScore());
        }

        return Arrays.stream(dp).max().getAsInt();
        
    }
}

class Pair {
	private int age;
	private int score;
	
	public Pair(int age, int score) {
		this.age = age;
		this.score = score;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getScore() {
		return this.score;
	}
}