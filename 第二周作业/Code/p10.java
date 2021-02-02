
public class p10 {
	// 判断是否符合条件
	public static void show(int[] x){
		int s = 10;
		for(int i=0;i<x.length;i++){
			if(x[i]==0){
				s = s - (i+1);
			}else{
				s = s*2;// 当前分数翻倍
			}
		}
		if(s==100){
			for(int i:x){
				System.out.print(i);
			}
			System.out.println();
		}
	}
	// 递归遍历每种情况
	public static void f(int[] x,int n){
		if(n>=x.length){
			show(x);	// 判断
			return;
		}
		x[n] = 0;
		f(x,n+1);
		x[n] = 1;
		f(x,n+1);
	}
	public static void main(String[] args){
		int[] x = new int[10];
		f(x,0);
	}
}