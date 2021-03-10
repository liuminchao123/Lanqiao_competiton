import java.util.Scanner;

public class p11{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int M=sc.nextInt();
		int count=0;
		int nums[]=new int[L+1];
		for(int x=0;x<=L;x++)
			nums[x]=1;
		for(int x=0;x<M;x++) {
			int s=sc.nextInt();
			int e=sc.nextInt();
			for(int y=s;y<=e;y++)
				nums[y]=0;
		}
		for(int s:nums)
			if(s==1)
				count++;
		System.out.println(count);
	}
}
