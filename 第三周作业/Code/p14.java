public class p14
{
	
	public static void Swap(int[] c,int i,int j)     //全排列算法的一部分
	{
		int tmp = c[i];
		c[i] = c[j];
		c[j] = tmp;
	}
	
	public static void AllPermutation(int[] c,int start)  //全排列算法
	{
		if(start==c.length-1)
		{
			if(c[0]==1)    //因为羊一定代表1，所以只需判断以1开头的排列即可
			{
				int tmp = c[5];  //先记录下c[5]，因为全排列中的数字必须是分别且只出现一次
				c[5] = c[3];     //应为有两个瑞字，所以有两个重复数字
				int A = c[0]*1000+c[1]*100+c[2]*10+c[3];   //三羊献瑞
				int B = c[4]*1000+c[5]*100+c[6]*10+c[7];   //祥瑞生辉
				int C = c[0]*10000+c[1]*1000+c[6]*100+c[3]*10+c[8];   //三羊生瑞气
				if(A+B==C)
				{
					System.out.println(c[0]+" "+c[1]+" "+c[2]+" "+c[3]); //输出三羊献瑞
					System.exit(0);       //退出虚拟机
				}
				c[5] = tmp;     //保证全排列数组中的数分别且只出现一次
			}
			else    //只判断以1开头，其他则不符合要求
			{
				System.exit(0);        //退出虚拟机
			}
		}
		else
		{
			for(int i=start,t=c.length;i<t;++i)
			{
				Swap(c,i,start);
				AllPermutation(c,start+1);
				Swap(c,start,i);
			}
		}
	}
 
	public static void main(String[] args)
	{
		int[] c = {1,0,2,3,4,5,6,7,8,9};     //1代表羊
		AllPermutation(c,0);    //全排列算法
	}
}