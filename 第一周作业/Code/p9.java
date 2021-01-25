import java.util.Scanner;
 
public class p9{
	static int n, result;
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		allsort(data, 0);
		System.out.println(result);
	}
 
	private static int split(int[] data, int j, int k) {
 
		int num = 0;
		for (int i = j; i < k; i++) {
			num = data[i] + num * 10;
		}
		return num;
	}
 
	public static void allsort(int[] data, int i) {
 
		if (i == data.length) {
 
			for (int j = 1; j < data.length; j++) {
				for (int k = j + 1; k < data.length; k++) {
					int pre = split(data, 0, j);
					int mid = split(data, j, k);
					int fon = split(data, k, 9);
					if (mid % fon != 0)
						continue;
					if (pre + mid / fon == n)
						result++;
				}
			}
			return;
		}
 
		for (int j = i; j < data.length; j++) {
 
			int temp = data[j];
			data[j] = data[i];
			data[i] = temp;
 
			allsort(data, i + 1);
 
			temp = data[j];
			data[j] = data[i];
			data[i] = temp;
		}
	}
}
