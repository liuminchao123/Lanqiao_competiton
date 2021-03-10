import java.util.Scanner;

public class p22{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 对于给定整数数组a[],寻找其中最大值，并返回下标。
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}
		int max = a[0], mun = 0;
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
				mun = i;
			}
		}
		System.out.println(max + " " + mun);
	}
}