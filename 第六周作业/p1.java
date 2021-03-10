import java.util.Scanner;

public class p1 {

	//所求棋牌长度,所求的种类的和
	static int n,sum=0;             
	 //二位数组表示棋盘
	static int[][] chess;          
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//存值
		n=sc.nextInt();  
		//存n*n的棋牌
		chess=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				chess[i][j]=sc.nextInt();
			}
		}
		//由题可知1可以放,0表示不能放,那我们就设 :2代表黑皇后;3代表白皇后.
		//从头开始放
		Drop(0,2);    
		//就算后输出所求的和
		System.out.println(sum);

	}
	
	//放置皇后 (h:行数,queen:黑/白皇后)
	private static void Drop(int h, int queen) {
		//判断是否最后一行
		if(h == n) { 
			//若此时是黑皇后放置完成,则递归放置白皇后,
			if(queen == 2){
				Drop(0,3);                  
			}
			//若是白皇后也放置完成了,则求得了一个解
			else {
				sum++; 
			}				                
			return;
		}
		
		//遍历
		for(int i=0;i<n;i++) {   
			//若不等于1,则进行下一个格子校验
			if(chess[h][i]!=1) continue;
			//校验此位置是否可以放置此皇后,可以则放置并进行下一行校验,不可以则继续下个格子的校验
			if(Check(h,i,queen)) {
				chess[h][i]=queen;
			}else{
				continue;                
			}
			//进行下一行校验
			Drop(h+1,queen);                     
			//将所放置的位置还原
			chess[h][i]=1;                       
		}
		return;		
	}

	//校验给定的[x,y] -->(hang,lie) 是否可以放置此皇后(queen)
	private static boolean Check(int hang, int lie, int queen) {
		//校验上面行的这列上是否已经放置,若已经放置了,则返回false
		for(int i=hang-1;i>=0;i--) {
			if(chess[i][lie]==queen)
				return false;
		}
		//校验两个方向的斜线上是否有放置,若已经放置了,则返回false
		for(int i=hang-1,j=lie-1;i>=0&&j>=0;i--,j--) {
			if(chess[i][j]==queen)
				return false;
		}
		for(int i=hang-1,j=lie+1;i>=0&&j<=(n-1);i--,j++) {
			if(chess[i][j]==queen)
				return false;
		}
		return true;
	}

}
