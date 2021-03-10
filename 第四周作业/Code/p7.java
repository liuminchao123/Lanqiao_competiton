import java.util.Scanner;

public class p7{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		long r = scanner.nextInt();
		final double PI = 3.14159265358979323;
		// double S = PI*r*r;
		// long S1 = (long)(S*1000000000);
		// // if(S1%100 >= 50)
		// // 	S1 = S1 + 100;
		// double S2 = S1 / 1000000000.00;
		System.out.println(String.format("%.7f", r*r*PI));		
	}
}