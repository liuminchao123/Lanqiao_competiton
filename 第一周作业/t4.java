
class Main{
	
	public static void main(String[] args) {
		dfs(0);
		System.out.println(ans);
	}
	
	static int[] a = new int[] {1,2,3,4,5,6,7,8,9};
	static int ans=0; // 计数器


	static void dfs(int m) {
		if(m>=9) {
			// 给abcdefghi 赋不同的值
			int A = a[0];
			int B = a[1];
			int C = a[2];
			int D = 100*a[3]+10*a[4]+a[5];
			int E = 100*a[6]+10*a[7]+a[8];

			// for(int i=0;i<9;i++){
			// 	System.out.println("m = " + m);
			// 	System.out.print("a[" + i + "] = " + a[i]+" "); // 打印出使等式成立的情况
			// 	System.out.println();
			// }
 
			if(A*C*E + B*E +D*C == 10*C*E) {
				ans++;  // 计数器加一
				for(int i=0;i<9;i++){
					System.out.print(a[i]+" "); // 打印出使等式成立的情况
				}
				System.out.println();
			}

			return; // 终止函数，返回空值
		}
		
		// 迭代核心
		for(int i = m; i < 9; i ++) {
			swap(m,i);
			dfs(m+1);
			swap(m,i);
		}
		
	}
 
 	// 交换数组中指定位置的两个元素
	static void swap(int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

}