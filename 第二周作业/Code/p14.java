import java.util.Scanner;


public class p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(f(n));
	}
	public static int f(int n) {//斐波那契数列的规律加上递归
		if (n==1) {
			return 1;
		}
		if (n==2) {
			return 2;
		}
		else {
			return f(n-1)+f(n-2);
		}
	}

}
