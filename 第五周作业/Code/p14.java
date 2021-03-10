
import java.util.Arrays;
import java.util.Scanner;

public class p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  read = new Scanner(System.in);
		int n = read.nextInt();//有几个手指头
		int m = read.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++)
		{
			array[i] = read.nextInt();
		}
		int count = 0;
		do{
			
			if(count == m)
			{
				for(int i =0;i<array.length;i++)
				{
					System.out.print(array[i]+" ");
				}
				break;
			}
			count++;
			
		}while(nextPermutation(array));
		read.close();
	}
	public static boolean nextPermutation(int[] array) {
		//沒有下一個全排列
		if(array.length<=1)
		{
			return false;
		}
		//从后往前找，找到第一个不满足降序的数（要考虑到重复的数字）
		int i = array.length-2;
		for(;i>=0&&array[i]>array[i+1];i--)
		{
			
		}
		//没有全排列
		if(i==-1)
		{
			return false;
		}
		 //从i开始往后找到大于arr[i]的最小的数
		int k =i+1;
		for(;k<array.length&&array[k]>array[i];k++)
		{
			
		}
		//交换arr[i]和arr[k-1]
		swap(array,i,k-1);
		//重新对arr[i]后面的数排序，接下来继续进行全排列操作
		Arrays.sort(array,i+1,array.length);
		return true;
	}

	public static void swap(int[] array, int i, int j) {
		int t =array[i];
		array[i] = array[j];
		array[j] =t;
		
	}

}

