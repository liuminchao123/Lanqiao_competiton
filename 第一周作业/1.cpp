#include <stdio.h>
#include <math.h>

double a[2]={0};
int v[4]={0};
int count=0;

void dfs(int x)
{
	if(x==5)
	{
		if(fabs(a[2]-a[1])<1000)
		{
			count++;
			printf("%0.0lf-%0.0f=%0.0lf\n",a[2],a[1],fabs(a[2]-a[1]));
		}
			
		return;
	}

	for(int i=1;i<3;i++)
	{	
		double t1=a[i];
		double t2=a[3-i];
		a[3-i]=a[3-i]+a[i]*0.25;
		a[i]=a[i]*0.75;
		
		dfs(x+1);
		a[i]=t1;
		a[3-i]=t2;
		
	}
	return;
}
int main()
{	
	a[1]=216;
	a[2]=1024;

	dfs(1);
	printf("%0.3lf",double(count)/double(16));
	return 0;
}