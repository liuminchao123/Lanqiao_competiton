
import java.util.Scanner;
public class p18 {
	public static void show(int[][] m) {
		for(int[] x:m){
			for(int y:x){
				System.out.print(y+"\t");
			}
			System.out.println("");
		}
	}
	// 顺时针螺旋
	public static int[][] helix(int n) {
		int[][] m = new int[n][n];	// 产生空矩阵
		int t = n*n;	// 填充矩阵从1到n*n个数
		int i = 0;		// 填充数字的位置(行下标) 
		int j = 0;		// 填充数字的位置(列下标) 
		int start = 0;	// 每填充一圈时用的边界(左上)
		int end = n;	// 每填充一圈时用的边界(右下)
		int x = 0;		// 填充左侧一竖列数字时用的起始位置(行下标)
		int y = 0;		// 填充左侧一竖列数字时用的起始位置(列下标)
		int count = 0;	// 标记那段程序执行,那段程序不执行
		for(int s=1;s<=t;s++){
			if(i==start&&j<end){	// 如果是第一行
				m[i][j++] = s;		// 填充第一行
			}else if(i<end-1&&count<1){	// count==0时处理
				j = end-1;	// 列设置为右边界
				i++;	// 行下标 下移
			}
			if(i>start&&i<end){
				if(j>start){
					if(i==end-1){	// 到下边界了
						m[i][j--] = s;	// 填充下边界
					}else{
						m[i][j] = s;	// 填充右侧一竖列数字
					}
				}else if(count==0){	// 只当count==0 时执行一次
					m[i][j] = s;	// 填充到了左下角的元素
					i--;		// 开始从下向上填充左侧元素(行坐标上移)
					x = i;		// 用新的下标x来填充左侧 (行下标)
					y = j;		// 用新的下标y来填充左侧 (列下标)
					count++;
				}else if(x>start&&y<end){
						m[x--][y] = s;	// 填充左侧
				}else if(x==start){	// 如果外圈填充完毕
					s--;	// 接下来填充的数字放到下一的内圈里(抵消循环的s++)
					start++;	// 左上角边界向内收缩 1
					end = --n;	// 右下角边界向内收缩 1
					i = start;	// 按边界的位置开始填充内圈(行下标)
					j = start;	// 按边界的位置开始填充内圈(列下标)
					x = i;	// 填充左侧一竖列数字时用的起始位置(行下标)
					y = j;	// 填充左侧一竖列数字时用的起始位置(列下标)
					count = 0;	// 恢复执行程序段的标记
				}
			}
		}
		return m;	// 返回矩阵
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		// System.out.print("输入一个整数:");
		int n = scan.nextInt();	// 输入 n 
		int[][] m = helix(n);	// 矩阵大小为n*n
		show(m);	// 输出矩阵
	}
}