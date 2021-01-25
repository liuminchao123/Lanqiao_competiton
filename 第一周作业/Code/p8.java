import java.util.Scanner;
public class p8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.141592653589793238;
		final double h = 2;
		double r = sc.nextDouble();
		
		//侧面积
		double a1 = 2 * PI * r * h;

		//顶部面积
		double a2 = PI * r * r;
		
		System.out.println(String.format("%.1f", (a1+a2)));
	}
}
