
public class p20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner in=new java.util.Scanner(System.in);
		int n=in.nextInt();
		String s=in.next();
		post_order(0,s.length()-1,s);
		in.close();
	}
	//后序遍历--->递归思想
	private static void post_order(int l,int r,String s){
		int mid=(l+r)/2;//控制分割的位置：在字符串的正中间分割开
		//先全部分割完，然后把全部结点标记之后再输出。
		if(l!=r){//分割：知道r=l=0才停止分割
			post_order(l,mid,s);//左子树
			post_order(mid+1,r,s);//右子树
		}
		//设置标记判断字符
		int flag1=0,flag2=0;//定义判断的变量
		for(int i=l;i<=r;i++){//标记判断字符（变量）并且根据01字符串（这里的字符串是已经不可再分割的字符串）给控制输出的两个变量flag1、flag2赋上对应的值
			if(s.charAt(i)=='0') flag1=1;
			if(s.charAt(i)=='1') flag2=1;
		}
		//根据判断字符变量来输出对应的字母：B、I、F
		if(flag1==1&&flag2==0) System.out.print("B");//只有0
		if(flag1==0&&flag2==1) System.out.print("I");//只有1
		if(flag1==1&&flag2==1) System.out.print("F");//既有0又有1
	}
}

