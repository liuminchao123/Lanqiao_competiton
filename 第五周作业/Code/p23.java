import java.util.Scanner;

public class p23 {
	public static void main(String[] args) {
		//定义n
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		//定义二维数组
		int[][] a = new int[n][n];
		//定义第一行
		a[0][0] = 1;
		//
		for(int i = 1;i<n;i++) {
			//定义每行的边
			a[i][0] = 1;
			a[i][i] = 1;
			//计算中间值
			for(int j = 1;j<i;j++) {
				a[i][j] = a[i-1][j-1]+a[i-1][j];
			}
		}
		//遍历杨辉三角
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<=i;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
