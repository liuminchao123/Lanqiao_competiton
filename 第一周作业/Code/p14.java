import java.util.Scanner;

public class p14{

	public static void main(String[] args) {
		int a,b,c,d,e,f;

	    for(a=123;a<=329;a++)
		{
	        int count,i;
	        int x[]=new int[10];
	        for(int l=0;l<=9;l++)x[l]=0;
	        b=2*a;c=3*a;
			d=a;e=b;f=c;
			while(d !=0)
			{
				x[d%10]++;
				d/=10;
			}
			while(e !=0)
			{
				x[e%10]++;
				e/=10;
			}
			while(f !=0)
			{
				x[f%10]++;
				f/=10;
			}
	        count=1;
	        for(i=1;i<=9;i++)
	            if(x[i]!=1)
				{
	                count=0;
	                break;
	            }
	        if(count !=0) 
				System.out.printf("%d %d %d\n",a,b,c);
	    }
	}
}

