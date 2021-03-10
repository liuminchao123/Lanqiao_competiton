import java.util.*;

public class p11{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int sum = x;//因为除第一次后面，每次循环时x的值要更新为sum值。
		for (int i = 0; i < n; i++) {
			x = sum;//更新x值
			sum = 0;//每次循环完毕后和值清空
			while (x != 0) {
				sum = sum + x % 10 * (x % 10);
				x = x / 10;
			}
		}
		System.out.println(sum);
	}
}

