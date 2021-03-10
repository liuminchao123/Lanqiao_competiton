import java.util.Scanner;

public class p25{

	static int[][] map;// 好心程度
	static int[][][][] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		map = new int[52][52];
		dp = new int[52][52][52][52];
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int sum = dp(m, n);
		System.out.println(sum);
	}

	static int dp(int m, int n) {
		for (int x1 = 1; x1 <= m; x1++) {
			for (int y1 = 1; y1 <= n; y1++) {
				for (int x2 = 1; x2 <= m; x2++) {
					for (int y2 = 1; y2 <= n; y2++) {
						/*
						 * 
						 * 如果第一个人没有走到最后一行或最后一列，并且两个人没有重复
						 * 因为走到最后一行或最后一列，容易造成第二个人无路可走的情况
						 */
						if ((x1 < m || y1 < n) && x1 == x2 && y1 == y2) {
							continue;
						}
						dp[x1][y1][x2][y2] = Math.max(Math.max(
								dp[x1 - 1][y1][x2 - 1][y2],
								dp[x1 - 1][y1][x2][y2 - 1]), Math.max(
								dp[x1][y1 - 1][x2 - 1][y2],
								dp[x1][y1 - 1][x2][y2 - 1]))
								+ map[x1][y1] + map[x2][y2];
					}
				}
			}
		}
		return dp[m][n][m][n];
	}

}

