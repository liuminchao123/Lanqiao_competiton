import java.util.Scanner;
 
public class p10 {
	// 输出
	public static void print(int[][] m){
		for(int[] x:m){
			for(int y:x){
				System.out.printf("%4d",y);
			}
			System.out.println();
		}
	}
	// 初始化
	public static void init(int[][] m){
		for(int i=0;i<m.length;i++){
			m[i] = new int[m.length-i];
		}
	}
	// 螺旋填充数字
	public static void f(int[][] m,int k,int num){
		if(k>=m.length/2) return ;
		// 第一行
		for(int i=k;i<m[k].length-k;i++){
			m[k][i] = num++; 
		}
		// 最后一位
		for(int i=k+1;i<m[k].length-k;i++){
			m[i][m[i].length-1-k] = num++; 
		}
		// 左列
		for(int i=m[k].length-2-k;i>k;i--){
			m[i][k] = num++; 
		}
		f(m,k+1,num);	// 递归进行内圈填充
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		// System.out.println("输入整数n（3~20）");
		int n = scan.nextInt();
		int[][] m = new int[n][];
		init(m);	// 初始化
		f(m,0,1);	// 螺旋填充数字
		print(m);	// 输出
	}
}