
 
/*
 看这个算式
 ☆☆☆ + ☆☆☆ = ☆☆☆
 如果每个五角星代表 1 ~ 9 的不同的数字。
 这个算式有多少种可能的正确填写方法？
 173 + 286 = 459
 295 + 173 = 468
 173 + 295 = 468
 183 + 492 = 675
 以上都是正确的填写法！
 注意：
 111 + 222 = 333 是错误的填写法！
 因为每个数字必须是不同的！ 
 也就是说：1~9中的所有数字，每个必须出现且仅出现一次！
 注意：
 不包括数字“0”！
 注意：
 满足加法交换率的式子算两种不同的答案。
 所以答案肯定是个偶数！
 注意：
 只要求计算不同的填法的数目！
 * */
 
public class p26 {
 
	public static void main(String[] args) {
 
		int[] data = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		allsort(data, 0);
		System.out.println(count);
	}
 
	static int count = 0;
 
	//全排列
	public static void allsort(int data[], int i) {
 
		if (i == data.length) {
			int a = data[0] * 100 + data[1] * 10 + data[2];
			int b = data[3] * 100 + data[4] * 10 + data[5];
			int c = data[6] * 100 + data[7] * 10 + data[8];
			if (a + b == c)
				count++;
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