import java.util.ArrayList;
import java.util.Scanner;
public class p12 {
	public static void main(String[] args) {
		int n;
		ArrayList<Integer> array=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();//输入n个数
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int m;//循环m次
		m=sc.nextInt();
		for(int i=0;i<m;i++) {
			int l,r,k;
			l=sc.nextInt();//实际位置坐标为l-1
			r=sc.nextInt();//实际位置坐标为r-1
			k=sc.nextInt();
			int temp=0;
			int[] b=new int[r-l+1];
			int h=0;
			for(int j=l-1;j<r;j++) {//传递给b数组
				   b[h]=a[j];
				   h++; 
				}
		  	for(int q=0;q<b.length-1;q++) {//外循环次数：总共遍历多少次
		  		for(int w=0;w<b.length-1-q;w++) {//内循环次数：比较多少次
		  			if(b[w]>b[w+1]) {
		  				temp=b[w];
		  				b[w]=b[w+1];
		  				b[w+1]=temp;
		  		}
			}
		}array.add(b[b.length-k]);
	}
	int tem=0;
	for (int i = 0; i < array.size(); i++) {
		tem=(int) array.get(i);
		System.out.println(tem);

    }
  }
}

