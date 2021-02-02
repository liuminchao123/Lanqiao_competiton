
import java.util.Scanner;

public class p16 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int tamp=scanner.nextInt();
		int n,m,sum=0;
		n=scanner.nextInt();
		m=scanner.nextInt();
		int[][] a=new int[10000/tamp+10][tamp];
		int x=-1,y=0,o=1;
		for (int i = 1; i <= 10000; i++) {
			x+=o;
			//System.out.println(y+"   "+x);
			a[y][x]=i;
			
			if((x==0||x==tamp-1)&&i!=1)
			{
				o=-o;
				y++;
				i++;
				//System.out.println(y+"   "+x);
				a[y][x]=i;
			}
		}
		x=y=-99;
		int x2=-99,y2=-99;
		for (int i = 0; i < ((10000/tamp)+1); i++) {
			for (int j = 0; j <tamp ; j++) {
				if (a[i][j]==n) {
					x=i;
					y=j;
					break;
				}
			}
			if (x!=-99&&y!=-99) {
				break;
			}
		}
		for (int i = 0; i < ((10000/tamp)+1); i++) {
			for (int j = 0; j <tamp ; j++) {
				if (a[i][j]==m) {
					x2=i;
					y2=j;
					break;
				}
			}
			if (x2!=-99&&y2!=-99) {
				break;
			}
		}
		sum=Math.abs(x-x2)+Math.abs(y-y2);
		System.out.println(sum);
	}
	
}

