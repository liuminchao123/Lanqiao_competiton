import java.util.Scanner;
 
public class p23{
 
	static long tmp = 2329089562800l;//求出1-30的最小公倍数
 
	/**
		 * 
		 * @param arr 存储分母的数组
		 * @param k  当前下标位置
		 * @param t 前面一个分母
		 */
	public static void f2(int arr[], int k, int t, long res) {
 
		if (k == arr.length) {
			long sum = 0;
 
			if (res == tmp) {
				for (int i = 0; i < arr.length; i++) {
					//					if (i == arr.length - 1) {
					//						System.out.println("1/" + arr[i]);
					//					} else {
					//						System.out.print("1/" + arr[i] + " ");
					//					}
					System.out.print(arr[i] + " ");
				}
				System.out.println();
 
			}
 
			return;
		}
 
		if (k == arr.length - 3) {//在这个位置检查前面的项数和是否超过了1
 
			if (res > tmp) {
				return;
			}
		}
		for (int i = t + 1; i < 30; i++) {//题目应该是分母不能超过30
			arr[k] = i;
 
			f2(arr, k + 1, i, res + tmp / i);
		}
	}
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int n = input.nextInt();
			//计算开始时间
			long start = System.currentTimeMillis();
			int arr[] = new int[n];
 
			f2(arr, 0, 0, 0);
 
			//计算结束时间
			long end = System.currentTimeMillis();
			//得到程序运行所耗时间
			System.out.println("time=" + (end - start));
		}
	}
}