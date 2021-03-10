

import java.util.Arrays;
import java.util.Scanner;

class S implements Comparable<S>
{
	int a,b,t;
	public S(int a,int b,int t) {
		this.a=a;
		this.b=b;
		this.t=t;
	}
	public int compareTo(S a)
	{
		return a.t-this.t;
	}
}

public class p16 {
	static int n;
	static int m;
    static int N=100010;
	static int []pre=new int [N];
	static S [] s =new S[N];
	public static int  fi(int x) {
		return pre[x]==x?pre[x]:(pre[x]=fi(pre[x]));
	}
	public static boolean check(int x,int y) {
		x=fi(x);
		y=fi(y);
		if(x==y) {
			return true ;
		}
		else {
			pre[x]=y;
			return false;
		}
			
	}
	public static void main(String[] args) {
		for(int i=0;i<N;i++) {
			pre[i]=i;
		}
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			int a,b,t;
			a=sc.nextInt();
			b=sc.nextInt();
			t=sc.nextInt();
			s[i]=new S(a,b,t);
		}
		Arrays.sort(s,0,m);
		int cnt=0,p=-1;
		for(int i=0;i<m;i++) {
			if(check(s[i].a,s[i].b)==false&&s[i].t!=p) {
				cnt++;
				p=s[i].t;
			}
		}
		System.out.println(cnt);
	}
}

