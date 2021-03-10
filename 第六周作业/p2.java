import java.util.ArrayList;
import java.util.Scanner;

public class p4{
	static ArrayList<Integer> arr;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int n=sc.nextInt();
		arr=new ArrayList<Integer>();	
		for(int x=0;x<n;x++) 
			arr.add(sc.nextInt());
		
		int nums[][]=new int[n+1][v+1];
		
		for(int x=1;x<=n;x++) {
			for(int y=1;y<=v;y++) {
				  if(arr.get(x-1)<=y) {
					  nums[x][y]=Math.max(nums[x-1][y],nums[x-1][y-arr.get(x-1)]+arr.get(x-1));
				  }else {
					  nums[x][y]=nums[x-1][y];
				  }
			}
		}
		System.out.println(v-nums[n][v]);	
	}
}
