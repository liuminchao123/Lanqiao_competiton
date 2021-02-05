
public class p9 {
 
	public static void main(String[] args) {
 
		// 方法一：
		// 老老实实的枚举
		int count = 0;
		for (int i = 2; i < 45; i++) {
			for (int j = 2; j < 45 * 45; j++) {
				int x = i + j, y = i * j;
				if (2 * y == 45 * x) {
					count++;
				}
			}
		}
		System.out.println(count);
 
		// 方法二:
		// 为什么i从23开始，因为2/45在2/44与2/46之间，所以分解的话，最大的边界就是1/23(2/46)
		int x, y = 0;
		for (int i = 23; i < 45; i++) {
			// 如果刚好整除，那么下面的判断就对了，如果不是整除，x * (2 * i - 45)也不会复原回i * 45
			x = i * 45 / (2 * i - 45);
			if (x * (2 * i - 45) == i * 45) {
				y++;
			}
		}
		// System.out.println(y);
	}
}