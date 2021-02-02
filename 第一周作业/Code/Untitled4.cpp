
#include<stdio.h>
int num=0;
int v[9]={0};//1-9数字是否被占领 
int a[9]={0};//各个字母填值 1-9表示表示A- 
void t();
void u(int);

void t()
{
	
	int sum1=a[1]*10000+a[3]*1000+a[7]*100+a[8]*10+a[9]+a[2]*1000+a[7]*100+a[8]*10+a[9]+a[3]*1000+a[4]*100+a[5]*10+a[6];
	int sum2=a[3]*10000+a[7]*1000+a[8]*100+a[9]*10;
	if(sum1==sum2)
	{	
		num++;
		printf("第%d种解法是",num);
		for(int i=1;i<10;i++)
		{
			printf("%d",a[i]);
		}
		printf("\n");
		return;
	}
		
	else
		return;
}

void u(int x)
{
	if(x>9)
	{	
		t();
	}
		
	for(int i=1;i<10;i++)
		if(v[i]==0)
		{
			v[i]=1;
			a[x]=i;
			u(x+1);
			v[i]=0;//回溯 
		}
}


int main()
{	
	u(1);	
	return 0;
}
