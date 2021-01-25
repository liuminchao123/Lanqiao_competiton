import java.util.Scanner;

public class p11{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=a*(b*0.01*0.8+1);

		System.out.println(String.format("%.2f", c));
								
	}
}
