import java.util.*;
public class p13 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[][] dp=new int[n+1][k+1];//把数字n划分为k个数
		for(int i=1;i<=n;i++)
			for(int j=1;j<=k;j++){
				if(j>i)
					continue;
				if(j==i || j==1)
					dp[i][j]=1;
				else if
					dp[i][j]=dp[i-1][j-1]+dp[i-j][j];
					/*两种情况
					1.将前一个数字的j划分的最后一个值添加一个1，即为当前数字的j+1划分的方案
					2.如果不是1则说明前数字的划分中每个数字至少为2，那么我们把当前数字i-j
					*/
					

			}
		System.out.println(dp[n][k]);
	}
}

