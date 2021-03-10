//解题思路：得到最小值是二个数组中一个数组最大值乘另一个数组最小值
package Main;

import java.util.Scanner;

public class p15 {
  
	public static void main(String[] args) {   
      Scanner scanner=new Scanner(System.in);  
      //接收有多少相乘的成对数组  
     	int n=scanner.nextInt();
     	 //接收相乘的成对数组最小数
     	int[] summin=new int[n];
     	for (int i = 0; i < n; i++) {
     		 //接收相乘的成对数组长度  
     		int s=scanner.nextInt();
     		 //接收相乘的成对数组第一组
     		int[] a=new int[s];
     		 //接收相乘的成对数组第二组  
     		int[] b=new int[s];
     		
     		for (int j = 0; j <s; j++) {
     			a[j]=scanner.nextInt();
				
			}
     		for (int j = 0; j <s; j++) {
     			b[j]=scanner.nextInt();
				
			}
     		
     		for (int j2 = 0; j2 < s; j2++) {
				for (int k = 0; k <s-1; k++) {
					 //相乘的成对数组第一组进行从大到小排列
					if(a[k+1]>a[k]) {
						int aa=a[k];
						a[k]=a[k+1];
						a[k+1]=aa;
					}
					 //相乘的成对数组第二组进行从小到大排列
					if(b[k+1]<b[k]) {
						int bb=b[k];
						b[k]=b[k+1];
						b[k+1]=bb;
					}
					
				}
				
			}
     		int sum=0;
     		//对排序的a，b数组进行相乘
     		for (int j = 0; j < s; j++) {
			     sum=sum+a[j]*b[j];
			}
     		
     		summin[i]=sum;
			
		}
     	//输出结果
     	for (int i = 0; i <n; i++) {
			System.out.println(summin[i]);	
		}
    scanner.close();
	}	
}


