import java.util.Scanner;

public class p25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N, m, i, t, x, y;
		N = input.nextInt();
		m = input.nextInt();
		int[] array = new int[N];
		for (i = 0; i < N; i++)
			array[i] = input.nextInt();
		for (i = 0; i < m; i++) {
			x = input.nextInt();
			y = input.nextInt();
			t = array[x - 1];
			array[x - 1] = array[y - 1];
			array[y - 1] = t;
		}
		for(int j:array)
			System.out.println(j);
	}
}




