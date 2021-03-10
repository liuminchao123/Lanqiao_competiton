import java.util.Scanner;

public class p16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] fn = new int[n];
		for(int i =0;i<n;i++)
			fn[i] = sc.nextInt();
		int a = sc.nextInt();
		for(int i = 0;i<n;i++) {
			if(i==n-1&&fn[i]!=a) {
				System.out.println("-1");
			}
			else if(fn[i]==a) {
				System.out.println(i+1);
				break;
			}
		}
	}
}
