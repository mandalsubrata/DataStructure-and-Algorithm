public class DynamicProgramming {

	public void findAllpalindrom(String s) {

		boolean[][] dp = new boolean[s.length()][s.length()];
		int count = 0;
		for(int g=0; g<s.length(); g++) {
			for(int i=0, j= g; j<dp.length; i++, j++) {
				if(g == 0) {
					dp[i][j] = true;
				}
				else if (g == 1) {
					if(s.charAt(i) == s.charAt(j)) {
						dp[i][j] = true;
					} else {
						dp[i][j] = false;
					}
				} else {
					if (s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true ) {
						dp[i][j] = true;
					} else {
						dp[i][j] = false;
					}
				}
				if (dp[i][j] == true) {
					count++;
				}
			}
		}
		System.out.println("total palindrom string count is = "+count);
		for(int i =0;i<dp.length;i++) {

		}

		for(int i =0;i<dp.length;i++) {

			for(int j=0;j<dp.length;j++) {
				System.out.print(dp[i][j] + "    ");
			}
			System.out.println("\n");
		}
	}


	public void findLargestpalindrom(String s) {	

		boolean[][] dp = new boolean[s.length()][s.length()];
		int start =0;
		int len = 1;
		int count =0;
		System.out.println("List of all palindrom");
		for(int g=0; g<s.length(); g++) {
			for(int i=0, j= g; j<dp.length; i++, j++) {
				if(g == 0) {
					dp[i][j] = true;
					len = g;
					start = i;
					System.out.println("Palindrom is= "+ s.substring(start, start + len +1));
				}

				else if (g == 1) {

					if(s.charAt(i) == s.charAt(j)) {
						dp[i][j] = true;
						start = i;
						len = g;
						System.out.println("Palindrom is= "+ s.substring(start, start + len +1));
					} else {
						dp[i][j] = false;
					}
				} else {
					if (s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true ) {
						dp[i][j] = true;

						if (g > len) {
							start = i;
							len = g;
						}
						System.out.println("Palindrom is= "+ s.substring(start, start + len +1));

					} else {
						dp[i][j] = false;
					}
				}
				if (dp[i][j] == true) {
					count++;
				}
			}

		}
		System.out.println("Longest palindrome substring is: "+ s.substring(start, start + len + 1));
		System.out.println("Total palindrom is= "+count);

	}
}
